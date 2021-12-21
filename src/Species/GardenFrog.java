package Species;

import MainKind.Frog;

public class GardenFrog extends Frog {

    public static String color = "Gray";

    public String getColor() {
        return this.color;
    }
    public GardenFrog() {
        super();
        this.species = "Garden Frog";
        introduction();
    }

    public GardenFrog(int age) {
        super(age);
    }
}
