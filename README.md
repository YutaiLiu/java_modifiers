# Java Modifiers

## Project Structure
```
                             class Creature
                                    |
                                    |
                      public abstract class Animal        public interface Airplane
                         /                     \                /
                        /                       \              /
      public abstract class Frog            public abstract class Fly
                  |                                     |
                  |                                     |
       public class GardenFrog               public class DomesticFly
```

## Class/Interface Modifiers (Top-level)

### Visibility
| Modifier | Class | Package | Subclass | World |
| --- | --- | --- | --- | --- |
| public | Y | Y | Y | Y |
| no modifier | Y | Y | N | N |

### public
- can be extended in other packages, reachable out of package.
- e.g. class **Animal**
### "No modifier"
- if you didn't specify any modifier class will work like a package-private class.
- e.g. class **Creature**
### final
- prohibiting class/interface to be inherited, means can not use this modifier with abstract class or interface.
- Modifier **final** doesn't affect visibility.
- e.g. some lowest level class like **GardenFrog** and **DomesticFly**, cause we don't want them to be scalable.

## Field/Method Modifiers (Member-level)

### Visibility
| Modifier | Class | Package | Subclass | World |
| --- | --- | --- | --- | --- |
| public | Y | Y | Y | Y |
| protected | Y | Y | Y | N |
| no modifier | Y | Y | N | N |
| private | Y | N | N | N |

### public
- field can be accessed to all classes, no getter and setter method needed, careful to use this modifier, cause it expose to everyone.
- e.g. most sub-class constructor method.
### protected
- access level lower than public，specifies that the member can only be accessed within its own package (as with package-private) and, in addition, by a subclass of its class in another package. Getter and setter are needed.
- e.g. variable **speed** in class **Animal**, we should use this only in some common super-class that cross different packages.
### "No modifier"
- access level lower than protected, like "package-private", can not be access from other package.
- e.g. constructor method of class **Creature**
### private
- field can be only accessed in its class, can only access with getter and setter from outside most of time you should define most variable as private, unless you have good reason not to.
- Some exceptions: fields and methods need to be inherit by sub-class, constructor method, class member (static variable and static method)
- **private method can not be overridden**
### static
- also known as "class level", you can define class variable and class method with this modifier. Computer will only store one copy in memory, you even do not need an obj exist all instantiated class obj will share it, save your RAM. you should define common message or features as static because they won't be different between different obj.
  - class variable: 
    - e.g. **GardenFrog.COLOR**
    - the correct way to use class variable is: ClassName.StaticVariable
  - class method: "static method" or "public static method"
    - do not need to instantiate first 
    - can only access class variable and class method 
    - can't access instance variable or instance method because they must use an object reference. 
    - Also, class methods cannot use the "this" keyword as there is no instance for "this" to refer to. 
    - **Class method can not be overridden**
### final
- also known as "content variable", will work with static at the same time, like "static final double PI = 3.1415926", final variable has to be initialized at the first place, and behavior like constant variable, immutable. 
- You should name all final static member with all upper case letter to differentiate them from others.
- e.g. **Fly.LIFESPAN**
- **final method can not be overridden**

## Class/Interface Heritage

### Class Heritage
A sub-level class can inherit from others in these ways:
1. extend one super-class
2. extend one super-class and implement one or multiple interfaces
3. extend one abstract class
4. extend one abstract class and implement one or multiple interfaces
5. implement one or multiple interfaces
Class which implement one or multiple interfaces has to implement all abstract methods in those interfaces to be a non-abstract class.

### Interface Heritage
As a sub-level interface, it can extend one or multiple interfaces.

### Special case: Nested class
A class nested in another class called nested class, to be even more special, it could be static. A static nested class is called static nested class, which can only access static member, otherwise it will be called inner class, which can access all members include private member (cause inner class is also part of outer class).

## Abstract Class & Interface

### Different Logic
To represent upper level concept, you can use abstract class or interface.
The difference in logic of abstract class and interface is:
- abstract class represent a "... is ..." logic, e.g. Fly is Animal, so Animal could be abstract class and Fly should extend it
- interface represent s "... like ..." logic, e.g. Fly like airplane, then airplane could be designed as an interface and left Fly implement it.

### Difference Between Abstract Class and Non-abstract Class
The main differences between abstract class and non-abstract class are:
1. abstract could contain abstract method, non-abstract class couldn't
2. abstract class can not be instantiated

### Interface
- Things interface could contain: fields(public static final), static method, default method, public abstract method
- Things interface couldn't contain: state (obj variable, because interface can not be instantiated), constructor (because no state), non-abstract and non-static or default method

### Method in Interface

#### Default Method
Interface has an special method since Java8, default method, which can be overridden by sub-class or sub-interfaces. 

#### Default Methods Use Same Name
If there are interfaces A and B define two default method share same return type, same name and same parameter, class C or interface C which implement or extend A and B at the same time, has to override that method to avoid clash. But if parameter is different there won't be a clash. If two methods have different return type, there is not way to solve, you can not override separately.

You can differentiate them by InterfaceA.super.MethodName() and InterfaceB.super.MethodName()

If there are two public abstract method using same name, same return type but different parameter, as sub-level class you need implement them separately.
