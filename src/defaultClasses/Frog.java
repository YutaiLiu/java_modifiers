package defaultClasses;

import publicClasses.Animal;

class Frog extends Animal {

    private final static double LIFESPAN = 120.0;
    double speed;

    Frog() {
        this.species = "Frog";
        this.speed = 1.0;
        this.age = 1.0;
    }

    Frog(double l, double h, double m) {
        this.length = l;
        this.height = h;
        this.mass = m;
    }

    void setLength(double l) {
        this.length = l;
    }

    void setHight(double h) {
        this.height = h;
    }

    void setMass(double m) {
        this.mass = m;
    }
}
