package Interfaces;

public class Vehicle extends Crashable implements Drivable {

    // Copy methods and vars from interface, you have to define how they are used
    // Must define everything that inside of your interface
    int numOfWheels = 2;
    double theSpeed = 0;

    int carStrength = 0;

    double PI = 3.14;

    // Every method that is defined in the interface must be as visable as the interface
    // Interface Drivable is public
    public int getWheel() {
        return this.numOfWheels;
    };

    public void setWheels(int numWheels) {
        this.numOfWheels = numWheels;
    };

    public double getSpeed() {
        return this.theSpeed;
    };

    public void setSpeed(double speed) {
        this.theSpeed = speed;
    };

    public Vehicle(int wheels, double speed) {
        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }

    // When defining the abstract methods, you have to get rid of the word 'abstract'
    public void setCarStrength(int carStrength) {
        this.carStrength = carStrength;
    };

    public int getCarStrength() {
        return this.carStrength;
    };

}
