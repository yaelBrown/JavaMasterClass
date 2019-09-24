public class Car {


    // instance variables
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        this.model = model;
    }

    public void displayModel() {
        System.out.println(this.model);
    }

    public String getModel() {
        return this.model;
    }

}