package com.revature.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class OtherClassTest {
    OtherClass sut;

    @BeforeEach
    public void beforeTest() {
        this.sut = new OtherClass();
    }


    @Test
    public void test_getDataForTodayShouldReturnTheDayOfTheWeekThatItIsToday() {
        //arrange
        String today = LocalDateTime.now().getDayOfWeek().toString();//FRIDAY
        String request = "today";
        String expectedResult = "Today is: " + today;

        //act
        String actualResult = sut.getData(request);

        //assert
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
