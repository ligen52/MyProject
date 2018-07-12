package com.mars.main;

import java.lang.annotation.Target;
import java.util.Arrays;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class QuickSort implements Sort {
    @Override
    public int[] sort(int[] input) {
        return qSort(input, 0, input.length - 1);
    }

    private int[] qSort(int[] a, int start, int end) {
        if (start >= end) {
            return a;
        }
        int i = start;
        int j = end;
        int key = a[start];
        while (i < j) {
            while (i < j && a[j] >= key) {
                j--;
            }
            if (i < j) {
                a[i] = a[j];
            }
            while (i < j && a[i] <= key) {
                i++;
            }
            if (i < j) {
                a[j] = a[i];
            }
        }
        a[i] = key;
        printArray(System.out, Arrays.stream(a).boxed().toArray(Integer[]::new));
        qSort(a, start, i - 1);
        qSort(a, i + 1, end);
        return a;
    }
}
