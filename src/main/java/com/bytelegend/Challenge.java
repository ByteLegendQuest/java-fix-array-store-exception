package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        String[] numbers = str.split(",");
        String result = "";
        String[] finaly = new String[numbers.length];

        for (int i = 0; i < numbers.length; ++i) {
            finaly[i] = String.valueOf(Integer.parseInt(numbers[i]) + 1);
        }

        return result.join(", ", finaly);
    }
}
