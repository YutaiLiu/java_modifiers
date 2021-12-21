package MainKind;

import Animal.Animal;

public class Frog extends Animal {

    public final static int LIFESPAN = 12;

    public Frog() {
        super();
    }

    public Frog(int age) {
        super();
        this.species = "FROG";
        if (setAge(age)) {
            introduction();
        } else {
            System.out.println("Frog can not live that long.");
        }
    }

    public boolean setAge(int age) {
        if (!this.isAlive) {
            System.out.println("This frog is died.");
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
            System.out.println("This frog is died.");
            return ;
        }
        if (!setAge(this.ageInMonth + time)) {
            System.out.println("This frog is too old to live.");
            return ;
        }
        this.size += 0.5 * time;
        this.mass += 0.1 * time;
        this.speed += 5 * time;
        introduction();
    }

    public void eat(Fly fly) {
        if (!this.isAlive) {
            System.out.println("This frog is died.");
            return ;
        }

        if (this.speed >= fly.getSpeed()) {
            fly.getEaten();
            System.out.println("Frog caught the fly. this fly got eaten.");
        } else {
            System.out.println("Fly is too fast, frog need grow up to catch this fly.");
        }
    }

    public void introduction() {
        System.out.println("This is a " + this.species + " obj, " + this.size + " inches big, " + this.mass + " lb weight, " + this.ageInMonth + " month old, " + this.speed + " mph fast, " + this.LIFESPAN + " month lifespan.");
    }
}
