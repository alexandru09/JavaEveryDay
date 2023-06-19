package misc.bitwiseOperators;

// https://www.baeldung.com/java-bitwise-operators
public class Main {
    public static void main(String[] args) {
        int value1 = 6;
        int value2 = 5;

        // OR operator
        int result = value1 | value2;
        System.out.println(result);

        // AND
        result = value1 & value2;
        System.out.println(result);

        // XOR
        result = value1 ^ value2;
        System.out.println(result);

        // COMPLEMENT(NOT)
        result = ~value1;
        System.out.println(result);
    }
}
