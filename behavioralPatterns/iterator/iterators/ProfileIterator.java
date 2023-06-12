package behavioralPatterns.iterator.iterators;

import behavioralPatterns.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
