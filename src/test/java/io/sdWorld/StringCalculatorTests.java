package io.sdWorld;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTests {

    private static final String EMPTY = "";
    private static StringCalculator stringCalculator;

    @BeforeClass
    public static void initialSetUp(){
        stringCalculator = new StringCalculator();
    }

    @Test
    public void testAddWithEmptyString(){
        assertEquals(0, stringCalculator.add(EMPTY));
    }

    @Test
    public void testAddWithOneNumber(){
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    public void testAddWithTwoNumber(){
        assertEquals(1, stringCalculator.add("1,2"));
    }

}
