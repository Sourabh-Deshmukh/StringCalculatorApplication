package io.sdWorld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTests {

    private static  final String EMPTY = "";

    @Test
    public void testAddWithEmptyString(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(EMPTY));
    }

}
