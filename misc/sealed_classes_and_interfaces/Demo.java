package misc.sealed_classes_and_interfaces;

public class Demo {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(4, "A-1234");

        // using pattern matching instead of traditional casting
        if (vehicle instanceof Car car) {
            System.out.println(car.getNumberOfSeats());
        } else if (vehicle instanceof Truck truck) {
            System.out.println(truck.getLoadCapacity());
        } else {
            throw new RuntimeException("Unknown instance of Vehicle.");
        }

        // same as if-else above, but with pattern matching for switch
        switch (vehicle) {
            case Car c -> System.out.println(c.getNumberOfSeats());
            case Truck t -> System.out.println(t.getLoadCapacity());
            default -> throw new RuntimeException("Unknown instance of Vehicle.");
        }
    }
}
