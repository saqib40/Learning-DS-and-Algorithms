package oops.cloning.deep;
// Deep Copy using Copy Constructor
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    // Copy Constructor
    Address(Address other) {
        this.city = other.city;
    }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = new Address(address); // Deep copy of address
    }
}

public class DeepClone2 {
    public static void main(String[] args) {
        Address addr1 = new Address("Bangalore");
        Person p1 = new Person("Saqib", addr1);
        Person p2 = new Person(p1.name, p1.address); // Deep copy

        p2.address.city = "Delhi"; // Modify copy

        System.out.println("p1 Address: " + p1.address.city); // Unchanged ✅
        System.out.println("p2 Address: " + p2.address.city);
    }
}

