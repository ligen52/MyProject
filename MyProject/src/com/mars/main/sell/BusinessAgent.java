package com.mars.main.sell;

public class BusinessAgent implements Sell {
    Vendor vendor;

    public BusinessAgent(Vendor vendor) {
        this.vendor = vendor;
    }

    @Override
    public void sell() {
        System.out.println("do sth before");
        vendor.sell();
        System.out.println("do sth after");
    }

    @Override
    public void ad() {
        System.out.println("do sth before");
        vendor.ad();
        System.out.println("do sth after");
    }
}
