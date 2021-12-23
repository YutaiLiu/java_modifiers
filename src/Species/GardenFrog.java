package Species;

import MainKind.Frog;

//To extend an abstract class, you have to implement all abstract method
//and you can add new fields and non-abstract methods in sub-class

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

    //In the heritage chain, if multiple method have same name, same parameter and same return value
    //that method is override again and again, when you calling the method, it refer to the last time of override
    //Like here, if you call gardenFrogObj.getSpeed(), it will come here
    //@Override annotation is optional but helpful
    @Override
    public int getSpeed() {
        //You can invoke super class method as part of the body
        super.getSpeed();
        int otherSpeed = 10;
        return otherSpeed;
    }

    //if the method has same name, same return value but different parameter
    //Java will treat them like two different method
    //Like here, you can call gardenFrogObj.getSpeed(20), it will come here
    public int getSpeed(int ac) {
        System.out.println("This getter has the same name with getter in father-class Animal");
        return this.speed + ac;
    }

    //But you can not change return type, otherwise it will trigger a compile error
    //Some thing like this, method share same name can not be override to different return type
//    public String getSpeed() {
//        return "Wrong way";
//    }

    public void introduction() {
        System.out.println("This is a " + SPECIES + " obj, " + this.size + " inches big, " + this.mass + " lb weight, " + this.ageInMonth + " month old, " + this.speed + " mph fast, " + this.LIFESPAN + " month lifespan.");
    }

}
