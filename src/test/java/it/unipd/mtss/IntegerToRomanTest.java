package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IntegerToRomanTest {
    @ParameterizedTest
    @CsvSource({ "10, X", "100, C", "1000, M", "3999, MMMCMXCIX", "1, I", "2, II", "3, III", "4, IV", "5, V",
            "6, VI", "7, VII", "8, VIII", "9, IX", "11, XI", "12, XII", "13, XIII", "14, XIV", "15, XV"})
    void testConvert(int number, String expected) {
        assertEquals(expected, IntegerToRoman.convert(number));
    }
    @Test
    void testConvertZero() {
        assertEquals("", IntegerToRoman.convert(0));
    }
    @Test
    void testConvertNegative() {
        assertEquals("", IntegerToRoman.convert(-1));
    }
    @Test
    void testConvertTooBig() {
        assertEquals("", IntegerToRoman.convert(4000));
    }
    @Test
    void testDummy() {
        new IntegerToRoman();
    }
}
