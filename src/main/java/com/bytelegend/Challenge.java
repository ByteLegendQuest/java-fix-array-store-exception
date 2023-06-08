package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        Object[] numbers = str.split(",");
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = Integer.parseInt(numbers[i].toString()) + 1;
        }
        String returnString = "";
        if (numbers.length > 0) returnString += numbers[0].toString();
        for (int i = 1; i < numbers.length; ++i) {
            returnString += "," + numbers[i].toString();
        }
        return returnString;
    }
}
