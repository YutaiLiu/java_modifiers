package defaultClasses;

import publicClasses.Animal;

public class Fly extends Animal {

    private final static int LIFESPAN = 6;

    public Fly() {
        super();
        this.species = "FLY";
        introduction();
    }

    public Fly(int age) {
        super();
        this.species = "FLY";
        if (!setAge(age)) {
            System.out.println("Fly can not live that long.");
        } else {
            introduction();
        }
    }

    public boolean setAge(int age) {
        if (!this.isAlive) {
            System.out.println("This fly is died.");
            return false;
        }
        if (age >= this.LIFESPAN) {
            this.isAlive = false;
            return false;
        }
        this.ageInMonth = age;
        return true;
    }

    public void growUp(int time) {
        if (!this.isAlive) {
            System.out.println("This fly is died.");
            return ;
        }
        if (!setAge(this.ageInMonth + time)) {
            System.out.println("This fly is too old to live.");
            return ;
        }
        this.size += 0.01 * time;
        this.mass += 0.01 * time;
        this.speed += 10 * time;
    }

    public void getEaten() {
        this.isAlive = false;
    }

    public void introduction() {
        System.out.println("This is a " + this.species + " obj, " + this.size + " inches big, " + this.mass + " lb weight, " + this.ageInMonth + " month old, " + this.speed + " mph fast, " + this.LIFESPAN + " month lifespan.");
    }
}
