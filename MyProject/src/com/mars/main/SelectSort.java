package com.mars.main;

public class SelectSort implements Sort {
    @Override
    public int[] sort(int[] input) {

        for (int i = 0; i < input.length; i++) {
            int min = input[i];
            int index = i;
            for (int j = i; j < input.length; j++) {
                if (min > input[j]) {
                    min = input[j];
                    index = j;
                }
            }
            input[index] = input[i];
            input[i] = min;
        }
        return input;
    }
}
