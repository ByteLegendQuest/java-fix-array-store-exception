package com.bytelegend;

import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        Object[] numbers = str.split(",");
        Object[] nums = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; ++i) {
            nums[i] = Integer.parseInt(numbers[i].toString()) + 1;
        }
        return String.join(",", Arrays.toString(nums));
    }
}
