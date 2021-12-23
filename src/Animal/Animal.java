package Animal;

public abstract class Animal extends Creature {

    protected int speed;

    public Animal() {
        super();
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

    public boolean isAlive() {
        return this.isAlive;
    }

    public abstract void growUp(int time);

    public abstract void introduction();

}
