package creationalPatterns.singleton.approach1;

/**
* Approach 1 of implementing the Singleton pattern
* Singleton with public final field
* The private constructor can still be called reflectively
* You can modify the private constructor to throw an exception
* As described in Effective Java 3rd ed. - Joshua Bloch
*/
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {}

    public void exitBuilding() {}
}
