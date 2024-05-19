////////////////////////////////////////////////////////////////////
// Gioele Scandaletti 2076444
// Valentina Vultaggio 2085213
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    static String printAsciiArt(String romanNumber){
        String asciiArt = "";

        String[] i = {"  _____ ", " |_   _|", "   | |  ", "   | |  ", "  _| |_ ", " |_____|"};
        String[] v = {" __      __", " \\ \\    / /", "  \\ \\  / / ", "   \\ \\/ /  ", "    \\  /   ", "     \\/    "};
        String[] x = {" __   __", " \\ \\ / /", "  \\ V / ", "   > <  ", "  / . \\ ", " /_/ \\_\\"};
        String[] l = {"  _      ", " | |     ", " | |     ", " | |     ", " | |____ ", " |______|"};
        String[] c = {"   _____ ", "  / ____|", " | |     ", " | |     ", " | |____ ", "  \\_____|"};
        String[] d = {"  _____  ", " |  __ \\ ", " | |  | |", " | |  | |", " | |__| |", " |_____/ "};
        String[] m = {"  __  __ ", " |  \\/  |", " | \\  / |", " | |\\/| |", " | |  | |", " |_|  |_|"};

        for (int j = 0; j < m.length; j++) {
            for (int k = 0; k < romanNumber.length(); k++) {
                asciiArt += switch (romanNumber.charAt(k)) {
                    case 'I' -> i[j];
                    case 'V' -> v[j];
                    case 'X' -> x[j];
                    case 'L' -> l[j];
                    case 'C' -> c[j];
                    case 'D' -> d[j];
                    case 'M' -> m[j];
                    default -> throw new IllegalArgumentException("Invalid Roman Number");
                };
            }
            asciiArt += "\n";
        }
        return asciiArt;
    }

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
}
