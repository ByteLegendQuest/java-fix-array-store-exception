package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void test() {
        Assertions.assertEquals("0,1,2", Challenge.incrementNumbersInCsv("1,2,3"));
        Assertions.assertEquals("97,98,99,-1", Challenge.incrementNumbersInCsv("98,99,100,0"));
    }
}
