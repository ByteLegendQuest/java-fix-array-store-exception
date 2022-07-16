package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        String[] numberStrings = str.split(",");
        String[] numbers = new String[numberStrings.length];
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = (Integer.parseInt(numberStrings[i]) + 1) + "";
        }
        return String.join(",", numbers);
    }
}
