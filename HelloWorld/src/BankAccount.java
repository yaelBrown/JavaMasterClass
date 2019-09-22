public class BankAccount {

    // instance variables
    private int balance;
    private String name;

    // Create getters and setters quickly in intellij
    // Code (at the top) > Generate (alt+insert) >  getter, setter, or getter and setter > select the fields > generate.

    // Constructors are methods with the same class name.
    // Constructors can be overloaded like methods.
    public BankAccount() {
        // 'this' within constructor, creates default parameters. Similar to passing default parameters in args with es6 js.
        this("Default Name");
        System.out.println("This is empty contstuctor!");
    }

    public BankAccount(String name) {
        // Don't call other methods within your constructor code.
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return this.balance;
    }

    // can call a method within a method.
    public void addFunds(int amt) {
        balance = balance + amt;
        System.out.println(this.getBalance());
    };

    public void withdrawFunds(int amt) {
        balance = balance - amt;
        System.out.println(this.getBalance());
    }

}
