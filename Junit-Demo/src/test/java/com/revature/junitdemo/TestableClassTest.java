package com.revature.junitdemo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestableClassTest {

    TestableClass systemUnderTest;
    OtherClass otherClass;

    @BeforeAll
    public static void setup() {

    }

    @BeforeEach
    public void beforeTest(@Mock OtherClass mockOtherClass) {
        this.otherClass = mockOtherClass;
        this.systemUnderTest = new TestableClass(this.otherClass);
    }

    @AfterEach
    public void afterTest() {
    }

    @AfterAll
    public static void tearDown() {

    }


    @Test
    public void test_reverseStringShouldReverseInputString() {
        //The Three A's
        //Arrange
        String testString = "0123456789";
        String expectedResult = "9876543210";

        //Act
        String actualResult = systemUnderTest.reverseString(testString);

        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_fetchDataShouldFormatTestDataProperly() {
        //Arrange
        String fetchRequest = "today";
        String mockResponse = "Today is: FRIDAY";
        String expectedResult = "EXTERNAL DATA: {Today is: FRIDAY}";
        Mockito.when(otherClass.getData(Mockito.<String>any())).thenReturn(mockResponse);

        //act
        String result = systemUnderTest.fetchData(fetchRequest);

        //assert
        Assertions.assertEquals(result, expectedResult);
    }
}
