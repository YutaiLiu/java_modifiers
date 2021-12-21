import Animal.Animal;
import MainKind.Frog;
import Species.GardenFrog;

//Visibility
//Modifier	    Alpha	Beta	Alphasub	Gamma
//public	    Y	    Y	    Y	        Y
//protected	    Y	    Y	    Y	        N
//no modifier	Y	    Y	    N	        N
//private	    Y	    N	    N	        N

//Field&Method modifier (member level): public, protected, default, private, static, final
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
//final: also known as "contant variable", will work with static at the same time, like "static final double PI = 3.1415926"
            //final variable has to be initialized at the first second, and behavior like constant variable, immutable

//Class modifier (top-level): public, default
//public class: can be extended in other packages, reachable out of package
//default class: package-private class

class main {
    public static void main(String[] args) {
        //class Frog and Fly can not be used here, because they are default class
        //which means they are only available in their package
        //unless they are public class
        //Frog firstFrog = new Frog();
        //Fly firstFly = new Fly();

        //GardenFrog is public class and inherit Frog class
        GardenFrog gFrog = new GardenFrog();

        System.out.println(GardenFrog.color);
        System.out.println(Frog.LIFESPAN);

        //You can instantiate GradenFrog obj with Animal reference
        Animal frog = new GardenFrog();
        //But you can only access the non-abstract method in Animal class
        //you have non-access to methods or fields extended in sub-class
        //like method Frog.eat() or GradenFrog.color
        //frog.eat();
        System.out.println(frog.getAge());


    }
}
