public class Dog extends Animal {
    // OOPS Inheritance: Dog extends Animal

    // constructer from Animal class
    public Dog(int brain, int body, int size, int weight, String name) {
        // Super method means it takes information from base class.
        // Super must be used as the first statement in the constructor.
        super(brain, body, size, weight, name);
    }

    // private methods specific to dog.
    private int eyes, legs, tail, teeth;
    private String coat;

    // using: super.method() lets you call a method in the parent class from within the child class.

    // fish don't sleep, they rest...
}
