package creationalPatterns.singleton.approach3;

/**
* Approach 3 of implementing the Singleton pattern
* Enum singleton - the preferred approach
* Similar to public field approach, provides serialization
* Immune to serialization/reflection attacks
* Can't use it if singleton has to extend a superclass
* As described in Effective Java 3rd ed. - Joshua Bloch
*/
public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {}
}
