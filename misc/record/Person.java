package misc.record;

import java.util.Objects;

public record Person (String name, String address) {
    public static String UNKNOWN_ADRESS = "Unknown";

    public static Person unnamed(String address) {
        return new Person("Unnamed", address);
    }
    
    public Person {
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
    }

    public Person(String name) {
        this(name, "Random address");
    }
}
