package com.bytelegend;

import java.util.ArrayList;
import java.util.List;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        String[] numbers = str.split(",");
        String result = "";
        int number;

        for (int i = 0; i < numbers.length; ++i) {
            number = Integer.parseInt(numbers[i]) + 1;
            numbers[i] = String.valueOf(number);
        }

        return result.join(", ", numbers);
    }
}
