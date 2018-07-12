package com.mars.main;

import java.util.Arrays;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = temp;
                }
            }
            printArray(System.out, Arrays.stream(input).boxed().toArray(Integer[]::new));
        }
        return input;
    }
}
