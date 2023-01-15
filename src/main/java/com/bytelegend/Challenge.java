package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        String[] numbers = str.split(",");
        String str2 = "";
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = Integer.parseInt(numbers[i]) + 1 + "";
            str2 += numbers[i];
            if (i < numbers.length - 1) {
                str2 += ",";
            }
        }
        return str2;
    }
}
