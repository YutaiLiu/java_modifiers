package Airplane;

//visibility of interface is same with class, could be public or "no modifier"

//interface can extends one or multiple interfaces, but only interfaces
//class can only extends one father class and one or multiple interfaces at the same time

public interface Airplane {
    //All fields in a interface are "public static final", unchangeable
    //All methods in a interface are "public abstract", unchangeable too
    //except static method and default method, since Java 8
    int NUMOFWINGS = 2;
}
