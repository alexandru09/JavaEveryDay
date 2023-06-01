package effectiveJava.itemSix;

/*
 * Effective Java 3rd edition - Joshua Bloch
 * Item 6 - Avoid creating unnecessary objects
 */
public class Main {
    public static void main(String[] args) {
        // Avoid creating unnecessary objects

        String s1 = new String("bikini"); // Creates new instance everytime - inefficient
        String s2 = "bikini"; // reuses instance - efficient   
    }

    // Inefficient, because sum has type "Long" 
    private static long sum() {
        Long sum = 0L; // sum should be long
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            // A Long instance is created here for every i value because autoboxing
            sum += i;
        }

        return sum;
    }
}
