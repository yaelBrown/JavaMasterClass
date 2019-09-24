public class Main {

    public static void main(String[] args) {
        int weightInPounds = 223;
        double PoundsInKgs = (double) (weightInPounds * 0.45359237);
        System.out.println(PoundsInKgs);

        // car class stuff
        Car audi = new Car();

        audi.setModel("A3");

        audi.displayModel();

        System.out.println(audi.getModel());

        // Encapsulation prevents you from modifing the private class variables directly.
        // You use getters and setters to help validate information you put into those variables.

        // Bank account stuff

        BankAccount johnny = new BankAccount();

        System.out.println("adding $400 to johnnys account");
        johnny.addFunds(400);

        System.out.println("Getting balance of johnnys account");
        System.out.println(johnny.getBalance());

        System.out.println("Withdrawing  $280 from johnnys account");
        johnny.withdrawFunds(280);

        // class is basically a blue print (for a house)
        // when you create a new house, you instantiate it
        // When you give someone the address of the house, the address is known as a reference
        // Can pass references as parameters to constructors and methods

        // Super is used to access/call the parent class members (vars and methods)
        // Super must be the first statement in each constructor.
        // This is used to access/call the current class members (vars and methods)

        // can use super or this anywhere in the class except for static areas.

        // Constructor chaining (see screenshot) prevent duplicate code
        // Duplicate code is more work and increases the chance of more bugs/error in code.

        // Method overloading providing two or more sperate methods within a class with same name but different parameters
        // Overloading reduces duplicated code and don't have to remember multiple method names.
        // Overloading is often referred to as Compile Time Polymorphism.
        // Method overriding means defining a method in child class that ALREADY exists in the parent class with same signature (arguments)
        // Method overriding is also known as Runtime Polymorphism and Dynamic Method Dispatch.
        // Using @Override immediately above the method definition. (Compiler will show error if we are not following overide rules correctly for that method).
        // Covariant return type ????

        // Static methods can't access instance methods and variables directly
        // Usually used for opeartions that don't require any data from an istance of the class. (from 'this')
        // Don't have access to 'this'  keyword
        // Main is a static method.

        // Instance methods belong to an instance of a class
        // To use instance method you have to instantiate the class first
        // Instance methods can access instance and instance variables directly.
        // Can also access static methods and variables directly.

        // Static variables are also known as static member variables
        // Every instance of that class shares the same static variable.
        // Make a change to static variable, all other instances will see the effect of the change.
        // Instance variables don't use the static keyword
        // Instance variables are also known as fields or members variables
        // Instance variables belong to an instance of a class.

        // All objects including arrays, implement the methods of class Object. (java.lang.Object)
        
    }

}