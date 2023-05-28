package creationalPatterns.builder.hierarchyBuilder;

import java.util.EnumSet;
import java.util.Set;
import java.util.Objects;

// Hierarchy Builder as described in the book Effective Java 3rd Edition - Josh Bloch
public abstract class Pizza {
    public enum Topping { HAM, MUSCHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
