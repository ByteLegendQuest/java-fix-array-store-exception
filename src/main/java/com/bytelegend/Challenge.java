package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        String[] original = str.split(",");
        String[] result = new String[original.length];
        for (int i = 0; i < original.length; ++i) {
            result[i] = Integer.toString(Integer.parseInt(original[i]) + 1);
        }
        return String.join(",", result);
    }
}
