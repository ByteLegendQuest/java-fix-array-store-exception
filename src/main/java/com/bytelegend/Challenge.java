package com.bytelegend;

import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        final String[] strings = Arrays.stream(str.split(","))
                .map(it -> String.valueOf(Integer.parseInt(it) + 1))
                .toArray(String[]::new);
        return String.join(",", strings);
    }
}
