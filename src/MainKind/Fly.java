package MainKind;

import Airplane.Airplane;
import Animal.Animal;

//Because fly is a kind of Animal, so it should inherit abstract class Animal
//and implement abstract method in it, if class Fly didn't implement all abstract method in Animal
//you must define class Fly as abstract class as well (like current situation)

//And because fly is like an airplane, so it does make sense that it could implement an Airplane interface

public abstract class Fly extends Animal implements Airplane {

    public static final int LIFESPAN = 6;

    //depends on different situation, constructor could be public or "no modifier" method
    public Fly() {
        super();
    }

    public Fly(int age) {
        super();
        if (!setAge(age)) {
            System.out.println("Fly can not live that long.");
        }
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
        introduction();
    }

    //define as private method, cause it an internal computing method, should not be reachable from outside
    private boolean setAge(int age) {
        if (!this.isAlive) {
            System.out.println("This fly is died.");
            return false;
        }
        if (age >= LIFESPAN) {
            this.isAlive = false;
            return false;
        }
        this.ageInMonth = age;
        return true;
    }

    //define as default method, cause it will only be used in class Frog which sit in the same package
    void gotEaten() {
        this.isAlive = false;
    }

}
