# Java Modifiers

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
- prohibiting class/interface to be extended.
- Modifier **final** doesn't affect visibility.

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
- e.g. like most constructor
### protected
- access level lower than public，specifies that the member can only be accessed within its own package (as with package-private) and, in addition, by a subclass of its class in another package. Getter and setter are needed.
- e.g. Like variable speed in class Animal
### "No modifier"
- access level lower than protected, like "package-private", can not be access from other package.
### private
- field can be only accessed in its class, can only access with getter and setter from outside most of time you should define most variable as private, unless you have good reason not to. **private method can not be overridden**
### static
- also known as "class level", you can define class variable and class method with this modifier.
  - class variable: computer will only store one copy in memory, you even do not need an obj exist all instantiated class obj will share to use it, save your RAM you should define common message as static variable because they won't be different between different obj, like GardenFrog.color the right way to use class variable is: ClassName.StaticVariable
  - class method: "static method" or "public static method" do not need to instantiate first can only access class variable and class method can't access instance variable or instance method because they must use an object reference. Also, class methods cannot use the "this" keyword as there is no instance for "this" to refer to. **class method can not be overridden**
### final
- also known as "content variable", will work with static at the same time, like "static final double PI = 3.1415926", final variable has to be initialized at the first second, and behavior like constant variable, immutable. **final method can not be overridden**
