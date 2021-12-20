package publicClasses;

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
