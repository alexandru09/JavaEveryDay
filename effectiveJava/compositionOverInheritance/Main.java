package effectiveJava.compositionOverInheritance;

import java.util.HashSet;
import java.util.List;

// Effective Java 3rd edition - Joshua Bloch
public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Snap", "Crackle", "Pop");
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(list);
        // returns 6, incorrect
        System.out.println(s.getAddCount());

        InstrumentedSet<String> is = new InstrumentedSet<>(new HashSet<>());
        is.addAll(list);
        // return 3, correct
        System.out.println(is.getAddCount());
    }
}
