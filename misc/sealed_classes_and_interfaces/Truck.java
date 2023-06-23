package misc.sealed_classes_and_interfaces;

public record Truck(int loadCapacity, String registrationNumber) implements Vehicle {
    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
