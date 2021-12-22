package Airplane;

//visibility of interface is same with class, could be public or default

//interface can extends one or multiple interfaces, but only interface
//class can only extends one father class and one or multiple interfaces at the same time

public interface Airplane {
    //All fields in a interface are "public static final", unchangeable
    //All methods in a interface are "public static", unchangeable too
    int NUMOFWINGS = 2;
}
