package structuralPatterns.bridge.remotes;

import structuralPatterns.bridge.devices.Device;

/*
 * Bridge pattern example from https://refactoring.guru/design-patterns/bridge/java/example
 */
public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
    
}
