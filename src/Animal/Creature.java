package Animal;

//Default class can only be used inside package
//but the class which extend it could be public class etc.

class Creature {
    protected double size;
    protected double mass;
    protected int ageInMonth;
    protected boolean isAlive;

    //depends on different situation, constructor could be public or default method
    //In here, constructor should be default, cause there is only class Animal will extend it
    //and they are in the same package
    Creature() {
        this.size = 0.1;
        this.mass = 0.1;
        this.ageInMonth = 0;
        this.isAlive = true;
    }

}
