package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        String[] numbers = str.split(",");
        Integer[] num = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; ++i) {
            num[i] = Integer.parseInt(numbers[i].toString()) + 1;
            System.out.println(num[i]);
        }
        return String.join(",", Arrays.toString(num));
    }
}
