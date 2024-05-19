////////////////////////////////////////////////////////////////////
// Gioele Scandaletti 2076444
// Valentina Vultaggio 2085213
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 3999) {
            return "";
        }
        int[] arabicValues = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanNumerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        
        String roman = "";
        
        for (int i = 0; i < arabicValues.length; i++) {
            while (number >= arabicValues[i]) {
                roman += romanNumerals[i];
                number -= arabicValues[i];
            }
        }
        
        return roman.toString();
    }
}
