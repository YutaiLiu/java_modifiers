import defaultClasses.Fly;
import defaultClasses.Frog;

class main {
    public static void main(String[] args) {
        Frog firstFrog = new Frog();
        Fly firstFly = new Fly();
        firstFrog.eat(firstFly);
        firstFly.growUp(1);
    }
}
