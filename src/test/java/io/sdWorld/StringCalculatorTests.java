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
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void testAddWithUnknownAmountOfNumber(){
        assertEquals(10, stringCalculator.add("1,2,3,4"));
    }

    @Test
    public void testAddWithNewLineCharacter(){
        assertEquals(10, stringCalculator.add("1\n2,3,4"));
    }

}
