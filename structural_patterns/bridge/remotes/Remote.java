package structural_patterns.bridge.remotes;

/*
 * Bridge pattern example from https://refactoring.guru/design-patterns/bridge/java/example
 */
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
