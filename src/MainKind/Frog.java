package MainKind;

import Animal.Animal;

//Because Frog is a kind of animal, so it does make sense that class Frog extends class Animal
//But because class Frog didn't implement all abstract method in Animal
//So class Frog has to be defined as abstract as well

public abstract class Frog extends Animal {

    public final static int LIFESPAN = 12;

    //depends on different situation, constructor could be public or default method
    public Frog() {
        super();
    }

    public Frog(int age) {
        super();
        if (!setAge(age)) {
            System.out.println("Frog can not live that long.");
        }
    }

    private boolean setAge(int age) {
        if (!this.isAlive) {
            System.out.println("This frog is died.");
            return false;
        }
        if (age >= LIFESPAN) {
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

        if (!fly.isAlive()) {
            System.out.println("This fly has already been eaten.");
            return ;
        }

        if (this.speed >= fly.getSpeed()) {
            fly.gotEaten();
            System.out.println("Frog caught the fly. this fly is eaten.");
        } else {
            System.out.println("Fly is too fast, frog need grow up to catch this fly.");
        }
    }

}
