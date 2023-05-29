package creationalPatterns.singleton.approach2;

/**
* Approach 2 of implementing the Singleton pattern
* Singleton with public static factory method
* The private constructor can still be called reflectively
* You can modify the private constructor to throw an exception
* You can later modify the factory method to create multiple instances
* if singleton is no longer needed
* As described in Effective Java 3rd ed. - Joshua Bloch
*/
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() {}
    public static Elvis getInstance() { return INSTANCE; }
    public void exitBuilding() {}
}
