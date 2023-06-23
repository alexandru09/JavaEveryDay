package misc.sealed_classes_and_interfaces;

public abstract sealed class Vehicle  permits Car, Truck {
    protected final String registrationNumber;
    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
