package com.bytelegend;

import java.util.Arrays;
import java.util.List;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        List<String> numbers = Arrays.asList(str.split(","));
        for (int i = 0; i < numbers.size(); ++i) {
            numbers.set(i, (Integer.parseInt(numbers.get(i)) + 1) + "");
        }
        return String.join(",", numbers);
    }
}
