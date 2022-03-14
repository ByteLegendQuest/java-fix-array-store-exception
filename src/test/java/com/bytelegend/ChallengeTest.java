package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void test() {
        Assertions.assertEquals("2,3,4", Challenge.incrementNumbersInCsv("1,2,3"));
        Assertions.assertEquals("98,99,100,0", Challenge.incrementNumbersInCsv("97,98,99,-1"));
    }
}
