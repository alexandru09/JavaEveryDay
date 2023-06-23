package misc.sealed_classes_and_interfaces;

public sealed interface Vehicle  permits Car, Truck {
    String getRegistrationNumber();
}
