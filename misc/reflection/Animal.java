package misc.reflection;

public abstract class Animal implements Eating {
    public static String CATEGORY = "domestic";
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    protected abstract String getSound();

    // getters, setters etc
}
