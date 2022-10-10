package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        Object[] numbers = str.split(",");
        String[] a = new String[numbers.length];
        for (int i = 0; i < numbers.length; ++i) {
            a[i] = "" + (Integer.parseInt(numbers[i].toString()) + 1);
        }
        return String.join(",",  a);
    }
}
