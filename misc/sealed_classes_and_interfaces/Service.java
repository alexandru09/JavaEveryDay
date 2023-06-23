package misc.sealed_classes_and_interfaces;

public sealed interface Service permits Car, Truck {
    int getMaxServiceIntervalInMonths();

    default int getMaxDistanceBetweenServicesInKilometers() {
        return 10_000;
    }
}
