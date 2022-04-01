package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        String[] numbers = str.split(",");
        int[] a = new int[10];
        for (int i = 0; i < numbers.length; ++i) {
            a[i] = Integer.parseInt(numbers[i]) + 1;
            numbers[i] = String.valueOf(a[i]);
        }
        return String.join(",", (String[]) numbers);
    }
}
