package Species;

import MainKind.Fly;

//To extend an abstract class, you have to implement all abstract method
//and you can add new fields and non-abstract methods in sub-class

public class DomesticFly extends Fly {

    //constant class variable
    public static final String COLOR = "Gray";
    public static final String SPECIES = "Domestic fly";

    //depends on different situation, constructor could be public or default method
    public DomesticFly() {
        super();
    }

    public DomesticFly(int age) {
        super(age);
    }

    public void introduction() {
        System.out.println("This is a " + SPECIES + " obj, " + this.size + " inches big, " + this.mass + " lb weight, " + this.ageInMonth + " month old, " + this.speed + " mph fast, " + LIFESPAN + " month lifespan.");
    }
}
