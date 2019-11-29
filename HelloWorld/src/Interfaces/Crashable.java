package Interfaces;

// Abstract - 7. something that concentrates in itself the essential qualities of anything more extensive or more general, or of several things; essence.
// use an abstract class where every method does not have to implemented to use the abstract class
public abstract class Crashable {
    boolean carDrivable = true;

    public void youCrashed() {
        this.carDrivable = false;
    }

    public abstract void setCarStrength(int carStrength);

    public abstract int getCarStrength();
}