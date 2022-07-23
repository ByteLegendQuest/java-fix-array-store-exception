package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        List<String> result = Arrays.stream(str.split(","))
                .map(Integer::parseInt)
                .map(number -> number + 1)
                .map(String::valueOf)
                .collect(Collectors.toList());

        return String.join(",", result);
    }
}
