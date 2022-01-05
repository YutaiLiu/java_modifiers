import Animal.Animal;
import MainKind.Fly;
import MainKind.Frog;
import Species.DomesticFly;
import Species.GardenFrog;

class main {
    public static void main(String[] args) {
        //Because Animal, Frog and Fly are abstract classes, to instantiate it
        //You must extend them as a non-abstract class, like GardenFrog and DomesticFly

        // Because you define obj firstFrog and firstFly as an Animal reference
        // you can only access the methods in Animal class
        // (of course include abstract method implemented by sub-class), like Animal.introduction()
        Animal firstFrog = new GardenFrog();
        Animal firstFly = new DomesticFly();
        System.out.println("-------------------Instantiate obj with Animal Reference-------------------");
        firstFrog.introduction();
        firstFly.introduction();
        // except method define out of Animal, like
        //firstFrog.eat();

        // Because you define secondFrog and secondFly as Frog and Fly reference
        // you can only access the methods implemented in those classes, like Frog.eat() and Fly.gotEaten()
        Frog secondFrog = new GardenFrog();
        Fly secondFly = new DomesticFly();
        System.out.println("-------------------Frog.eat()-------------------");
        secondFrog.eat(secondFly);
        System.out.println("Is this fly still alive? " + secondFly.isAlive());

        //define GardenFrog obj with GardenFrog reference will have access to all fields and methods
        //so does DomesticFly
        GardenFrog thirdFrog = new GardenFrog();
        DomesticFly thirdFly = new DomesticFly();

        // Although Frog.eat() need an Fly obj as parameter
        // but DomesticFly obj is also valid, because DomesticFly extends Fly
        System.out.println("-------------------Use Frog.eat() in Sub-class-------------------");
        secondFrog.eat(thirdFly);
        System.out.println("Is this fly still alive? " + thirdFly.isAlive());
        thirdFrog.eat(thirdFly);

        // This is the right way to use class variable, ClassName.VariableName
        // so do class methods, ClassName.MethodName
        System.out.println("-------------------Class Variable-------------------");
        System.out.println(GardenFrog.COLOR);
        System.out.println(Frog.LIFESPAN);
        System.out.println(Fly.NUMOFWINGS);
        System.out.println(DomesticFly.NUMOFWINGS);

        //When multiple methods has the same name in the heritage chain, to void conflict
        //compile will look it up in reference class
        //unless you are using super.MethodName to differentiate them
        System.out.println("-------------------When Sub-class has same name method with Super-class-------------------");
        System.out.println(secondFrog.getSpeed());
        //Like here, compiler will look at class GardenFrog, because thirdFrog' reference type is GardenFrog
        System.out.println(thirdFrog.getSpeed(1));
        System.out.println(thirdFrog.getSpeed());



    }
}
