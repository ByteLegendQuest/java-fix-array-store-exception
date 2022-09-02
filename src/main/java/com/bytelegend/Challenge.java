package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(incrementNumbersInCsv("1,2,3"));
        System.out.println(incrementNumbersInCsv("-1,999"));
    }

    public static String incrementNumbersInCsv(String str) {
        Object[] numbers = str.split(","); //通过特定的分隔符对字符串进行切片
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = String.valueOf(Integer.parseInt(numbers[i].toString()) + 1);
        }
        return String.join(",", (String[]) numbers); //使用指定的分隔符拼接字符串
    }
}
