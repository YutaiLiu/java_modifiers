package Species;

import MainKind.Frog;

public class GardenFrog extends Frog {

    //constant class variable
    public static final String COLOR = "Green";
    public static final String SPECIES = "Garden Frog";

    //depends on different situation, constructor could be public or default method
    public GardenFrog() {
        super();
    }

    public GardenFrog(int age) {
        super(age);
    }

    //When multiple methods has the same name, to void conflict
    //compile will look it up in reference class
    public int getSpeed(int ac) {
        System.out.println("This getter has the same name with getter in father-class Animal");
        return this.speed + ac;
    }

    public void introduction() {
        System.out.println("This is a " + SPECIES + " obj, " + this.size + " inches big, " + this.mass + " lb weight, " + this.ageInMonth + " month old, " + this.speed + " mph fast, " + this.LIFESPAN + " month lifespan.");
    }

}
