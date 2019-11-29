package Interfaces;

public class InterfaceMain {

    public static void main(String[] args) {
        Vehicle car = new Vehicle(4, 48.0);

        // Using the interfaces
        System.out.println("car = " + car);
        System.out.println("car.getSpeed() = " + car.getSpeed());
        System.out.println("car.getWheel() = " + car.getWheel());

        // Using the abstract methods
        car.setCarStrength(10);
        System.out.println("car.getCarStrength() = " + car.getCarStrength());

    }

}
