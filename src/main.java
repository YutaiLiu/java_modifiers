import Animal.Animal;
import MainKind.Fly;
import MainKind.Frog;
import Species.DomesticFly;
import Species.GardenFrog;

//Visibility
//Modifier	    Alpha	Beta	Alphasub	Gamma
//public	    Y	    Y	    Y	        Y
//protected	    Y	    Y	    Y	        N
//no modifier	Y	    Y	    N	        N
//private	    Y	    N	    N	        N

//                          Field&Method modifier (member level):
//                  public, protected, default, private, static, final
//public: field can be accessed to all classes, no getter and setter method needed
            // careful to use, cause it's easy to be changed
//protected: access level lower than public，specifies that
            // the member can only be accessed within its own package (as with package-private)
            // and, in addition, by a subclass of its class in another package.
//default: access level lower than protected, like "package-private",
            // can not be access from other package
//private: field can be only accessed in its class, can only access with getter and setter from outside
            // most of time you should define most variable as private, unless you have good reason not to
//static: also known as "class level", you can define class variable and class method with this modifier
            // class variable: computer will only store one copy in memory, you even do not need an obj exist
                            // all instantiated class obj will share to use it, save your RAM
                            // you should define common message as static variable
                            // because they won't be different between different obj, like GardenFrog.color
                            // the right way to use class variable is: ClassName.StaticVariable
            // class method: "static method" or "public static method"
                            //do not need to instantiate first
                            //can only access class variable and class method
                            //can't access instance variable or instance method because they must use an object reference.
                            // Also, class methods cannot use the "this" keyword as there is no instance for "this" to refer to.
//final: also known as "content variable", will work with static at the same time, like "static final double PI = 3.1415926"
            //final variable has to be initialized at the first second, and behavior like constant variable, immutable

//                          Class modifier (top-level):
//                  public, default
//public class: can be extended in other packages, reachable out of package
//default class: package-private class

// Project Structure
// package Animal:                      public abstract class Animal + default class Creature
//                                                  /                     \
//                                                 /                       \
// package MainKind:            public abstract class Frog              public abstract class Fly
//                                          |                                       |
//                                          |                                       |
// package Species:             public class GardenFrog                 public class DomesticFly


//As upper level concept, you can use abstract class or interface to represent
//the difference between logic of abstract class and interface is:
//abstract class represent a "... is ..." logic, e.g. Fly is Animal, so Animal could be abstract class and Fly should extend it
//interface represent s "... like ..." logic, e.g. Fly like airplane, then airplane could be designed as an interface and left Fly implement it

//the main differences between abstract class and non-abstract class are
//1. abstract could contain abstract method, non-abstract class couldn't
//2. abstract can not be instantiated

//
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
        System.out.println("-------------------When Sub-class has same name method with Super-class-------------------");
        System.out.println(secondFrog.getSpeed());
        //Like here, compiler will look at class GardenFrog, because thirdFrog' reference type is GardenFrog
        System.out.println(thirdFrog.getSpeed(1));



    }
}
