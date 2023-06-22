package misc.record;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Alex", "100 Street");

        System.out.println(person.name());
        System.out.println(person.address());

        String name = "Mike";
        String address = "New York";

        Person person1 = new Person(name, address);
        Person person2 = new Person(name, address);

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
