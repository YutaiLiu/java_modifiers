package Animal;

public abstract class Animal extends Creature {

    protected int speed;

    public Animal() {
        super();
        this.speed = 0;
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

    //Use this method to let obj grow-up, different species should have different grow-ratio
    public abstract void growUp(int time);

    //print detail information of obj
    public abstract void introduction();

}
