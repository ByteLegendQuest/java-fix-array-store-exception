package com.bytelegend;

import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        Object[] numbers = str.split(",");
        int[] number = new int[numbers.length];
        for (int i = 0; i < numbers.length; ++i) {
            number[i] = Integer.parseInt(numbers[i].toString()) + 1;
        }
        return Arrays.toString(number).replace("[", "").replace("]", "");
    }
}
