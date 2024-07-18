package assignment4;

public class Main {
    //3. Create a Main class with a main method to test the Person class
    // by creating objects using each constructor and printing their details.

    public static void main(String[] args) {
        Person p1=new Person("Valli");
        Person p2=new Person("Soundarya", 21);
        Person p3=new Person("Parvathi",21,"Tambaram, Chennai");

        System.out.println("Object created using 1st constructor:");
        System.out.println("Name: "+p1.name);
        System.out.println("Object created using 2nd constructor:");
        System.out.println("Name: "+p2.name);
        System.out.println("Age: "+p2.age);
        System.out.println("Object created using 3rd constructor:");
        System.out.println("Name: "+p3.name);
        System.out.println("Age: "+p3.age);
        System.out.println("Address: "+p3.address);
    }
}
