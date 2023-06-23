package misc.sealed_classes_and_interfaces;

public record Car(int numberOfSeats, String registrationNumber) implements Vehicle {
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
