package assignment4;

public class Person {
    //2. Create a class named Person.
    // Overload the constructors such that first constructor takes a single String argument for the name,
    // second takes a String argument for the name and an int argument for the age and
    // third constructor takes a String argument for the name, an int argument for the age, and a String argument for the address.
    String name;
    int age;
    String address;
    Person(String name){
        this.name=name;
    }

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
}