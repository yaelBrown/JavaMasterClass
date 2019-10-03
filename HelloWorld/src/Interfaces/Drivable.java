package Interfaces;

public interface Drivable {

    // Interface is the verb
    // Interface allows you to add additional funactionality to a class (since you can't extend from more than one class)
    // You define the rules in the interface, not the methods themselves.
    double PI = 3.14;

    int getWheel();

    void setWheels(int numWheels);

    double getSpeed();

    void setSpeed(double speed);

    // Nice tight and compact
}
