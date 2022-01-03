import Animal.Animal;
import MainKind.Fly;
import MainKind.Frog;
import Species.DomesticFly;
import Species.GardenFrog;

// Project Structure
// package Animal:                      public abstract class Animal + default class Creature
//                                                  /                     \
//                                                 /                       \
// package MainKind:            public abstract class Frog              public abstract class Fly
//                                          |                                       |
//                                          |                                       |
// package Species:             public class GardenFrog                 public class DomesticFly

                            //Abstract Class & Interface
//As upper level concept, you can use abstract class or interface to represent
//the difference between logic of abstract class and interface is:
//abstract class represent a "... is ..." logic, e.g. Fly is Animal, so Animal could be abstract class and Fly should extend it
//interface represent s "... like ..." logic, e.g. Fly like airplane, then airplane could be designed as an interface and left Fly implement it

//the main differences between abstract class and non-abstract class are
//1. abstract could contain abstract method, non-abstract class couldn't
//2. abstract can not be instantiated

//Interface has an special method since Java8, default method, which can be overridden by sub-class or sub-interfaces
        // If there are interfaces A and B implement two default method share same return type, same name and same parameter
        // class C or interface C which implement or extend A and B at the same time, has to override that method to avoid clash
        // if parameter is different there won't be a clash,
        // if two method have different return type, there is not way to solve, you can not override separately
        // You can differentiate them by InterfaceA.super.MethodName() and InterfaceB.super.MethodName()
//Things interface could contain: fields, static method, default method, public abstract method
//Things interface couldn't contain: state (obj variable, because interface can not be instantiated),
        // constructor (because no state), non-abstract and non-static or default method

                            // Class Heritage
// A class can inherit from upper level in these combinations:
// 1. extend one super-class
// 2. extend one super-class and implement one or multiple interfaces
// 3. extend one abstract class
// 4. extend one abstract class and implement one or multiple interfaces
// 5. implement one or multiple interfaces
// As a sub-level class, it can only extend one abstract or non-abstract super-class,
// but could implement one or multiple interfaces
// As a sub-level interface, it can extend one or multiple interfaces
// A special case: Nested class
    // a class nested in another class called nested class, to be even more special, it could be static
    // a static nested class is called static nested class, which can only access static member
    // otherwise it is called inner class, which can access all members include private member
    // (cause inner class is also part of outer class)

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
