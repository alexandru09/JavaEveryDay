package effectiveJava.compositionOverInheritance;

import java.util.Collection;
import java.util.HashSet;

// Inappropriate use of inheritance
// Effective Java 3rd edition - Joshua Bloch
public class InstrumentedHashSet<E> extends HashSet<E> {
    // number of attempted element insertions
    private int addCount = 0;
    
    public InstrumentedHashSet() {}

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    public int getAddCount() {
        return addCount;
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
}
