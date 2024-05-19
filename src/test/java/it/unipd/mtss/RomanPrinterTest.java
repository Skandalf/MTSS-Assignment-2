package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanPrinterTest {
    @Test
    void testDummy() {
        new RomanPrinter();
    }
    @Test
    void testI() {
        String expected = "  _____ \n" +
                          " |_   _|\n" +
                          "   | |  \n" +
                          "   | |  \n" +
                          "  _| |_ \n" +
                          " |_____|\n";
        String actual = RomanPrinter.printAsciiArt("I");
        assertEquals(expected, actual);
    }
    @Test
    void testV() {
        String expected = " __      __\n" +
                          " \\ \\    / /\n" +
                          "  \\ \\  / / \n" +
                          "   \\ \\/ /  \n" +
                          "    \\  /   \n" +
                          "     \\/    \n";
        String actual = RomanPrinter.printAsciiArt("V");
        assertEquals(expected, actual);
    }
    @Test
    void testX() {
        String expected = " __   __\n" +
                          " \\ \\ / /\n" +
                          "  \\ V / \n" +
                          "   > <  \n" +
                          "  / . \\ \n" +
                          " /_/ \\_\\\n";
        String actual = RomanPrinter.printAsciiArt("X");
        assertEquals(expected, actual);
    }
    @Test
    void testL() {
        String expected = "  _      \n" +
                          " | |     \n" +
                          " | |     \n" +
                          " | |     \n" +
                          " | |____ \n" +
                          " |______|\n";
        String actual = RomanPrinter.printAsciiArt("L");
        assertEquals(expected, actual);
    }
    @Test
    void testC() {
        String expected = "   _____ \n" +
                          "  / ____|\n" +
                          " | |     \n" +
                          " | |     \n" +
                          " | |____ \n" +
                          "  \\_____|\n";
        String actual = RomanPrinter.printAsciiArt("C");
        assertEquals(expected, actual);
    }
    @Test
    void testD() {
        String expected = "  _____  \n" +
                          " |  __ \\ \n" +
                          " | |  | |\n" +
                          " | |  | |\n" +
                          " | |__| |\n" +
                          " |_____/ \n";
        String actual = RomanPrinter.printAsciiArt("D");
        assertEquals(expected, actual);
    }
    @Test
    void testM() {
        String expected = "  __  __ \n" +
                          " |  \\/  |\n" +
                          " | \\  / |\n" +
                          " | |\\/| |\n" +
                          " | |  | |\n" +
                          " |_|  |_|\n";
        String actual = RomanPrinter.printAsciiArt("M");
        assertEquals(expected, actual);
    }
    @Test
    void testIVXL() {
        String expected = "  _____  __      __ __   __  _      \n" +
                          " |_   _| \\ \\    / / \\ \\ / / | |     \n" +
                          "   | |    \\ \\  / /   \\ V /  | |     \n" +
                          "   | |     \\ \\/ /     > <   | |     \n" +
                          "  _| |_     \\  /     / . \\  | |____ \n" +
                          " |_____|     \\/     /_/ \\_\\ |______|\n";
        String actual = RomanPrinter.printAsciiArt("IVXL");
        assertEquals(expected, actual);
    }
}
