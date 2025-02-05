package oops.cloning.deep;

class Address implements Cloneable {
    String city;
    
    Address(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Address(this.city); // New object instead of reference copy
    }
}

class Person implements Cloneable {
    String name;
    Address address;  // Object reference

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) address.clone(); // Manually clone nested object
        return cloned;
    }
}

public class DeepClone1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Bangalore");
        Person p1 = new Person("Saqib", addr);
        Person p2 = (Person) p1.clone(); // Deep cloning p1

        System.out.println("Before Modification:");
        System.out.println("p1 Address: " + p1.address.city);
        System.out.println("p2 Address: " + p2.address.city);

        p2.address.city = "Delhi"; // Change in copied object

        System.out.println("\nAfter Modification:");
        System.out.println("p1 Address: " + p1.address.city); // Unchanged ✅
        System.out.println("p2 Address: " + p2.address.city);
    }
}

/*Before Modification:
p1 Address: Bangalore
p2 Address: Bangalore

After Modification:
p1 Address: Bangalore
p2 Address: Delhi
 */