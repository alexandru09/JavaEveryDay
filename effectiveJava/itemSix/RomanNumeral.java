package effectiveJava.itemSix;

import java.util.regex.Pattern;

public class RomanNumeral {
    // Inefficient - String.matches() internally creates a Pattern instance,
    // uses it only once and then destroys it.
    static boolean isRomanNumeral1(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
        + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    // Efficient - reusing the Pattern object
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
        + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral2(String s) {
        return ROMAN.matcher(s).matches();
    }
}
