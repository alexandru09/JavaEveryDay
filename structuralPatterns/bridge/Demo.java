package structuralPatterns.bridge;

import structuralPatterns.bridge.devices.Device;
import structuralPatterns.bridge.devices.Radio;
import structuralPatterns.bridge.devices.Tv;
import structuralPatterns.bridge.remotes.AdvancedRemote;
import structuralPatterns.bridge.remotes.BasicRemote;

/*
 * Bridge pattern example from https://refactoring.guru/design-patterns/bridge/java/example
 */
public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Test with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
