package Animal;

//As upper level concept, you can use abstract class or interface to represent
//the difference between logic of abstract class and interface is:
//abstract class represent a "... is ..." logic, e.g. Fly is Animal, so Animal could be abstract class and Fly should extend it
//interface represent s "... like ..." logic, e.g. Fly like airplane, then airplane could be designed as an interface and left Fly implement it


//the main differences between abstract class and non-abstract class are
//1. abstract could contain abstract method, non-abstract class couldn't
//2. abstract can not be instantiated

public abstract class Animal {

    protected static String species;
    protected double size;
    protected double mass;
    protected int ageInMonth;
    protected int speed;
    protected boolean isAlive = true;

    public Animal() {
        this.species = null;
        this.size = 0.1;
        this.mass = 0.1;
        this.ageInMonth = 1;
        this.speed = 0;
    }

    public String getSpecies() {
        return this.species;
    }

    public double getSize() {
        return this.size;
    }

    public double getMass() {
        return this.mass;
    }

    public int getAge() {
        return this.ageInMonth;
    }

    public int getSpeed() {
        return this.speed;
    }

    public abstract void growUp(int time);

    public abstract void introduction();

}
