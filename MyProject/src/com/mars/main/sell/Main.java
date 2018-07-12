package com.mars.main.sell;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
//        staticProxy();
        dynamicProxy();
    }

    private static void dynamicProxy() {
        DynamicProxy inter = new DynamicProxy(new Vendor());
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Sell sell = (Sell) Proxy.newProxyInstance(Sell.class.getClassLoader(), new Class[]{Sell.class},
            inter);
        sell.sell();
        sell.ad();
    }

    private static void staticProxy() {
        BusinessAgent agent = new BusinessAgent(new Vendor());
        agent.sell();
        agent.ad();
    }
}
