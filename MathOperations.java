package assignment4;

public class MathOperations {
    //1. Create a Java class MathOperations with methods for basic mathematical operations such as
    //add() , subtract() , multiply() , and divide() . Implement method overloading to allow these
    // operations for integers, doubles, and optionally, other types.

    public void add(int x,int y){
        System.out.println(x+y);
    }
    public void add(double x,double y){
        System.out.println(x+y);
    }


    public void subtract(int a,int b){
        System.out.println(a-b);
    }

    public void subtract(double a,double b){
        System.out.println(a-b);
    }



    public void multiply(int n,int m){
        System.out.println(n*m);
    }

    public void multiply(double n,double m){
        System.out.println(n*m);
    }



    public void divide(int i,int j){
        if(j!=0)
            System.out.println(i/j);
        else
            System.out.println("Error, Cant divide by zero");
    }

    public void divide(double i,double j){
        if(j!=0)
            System.out.println(i/j);
        else
            System.out.println("Error, Cant divide by zero");
    }





    public static void main(String[] args) {
        MathOperations m1=new MathOperations();
        m1.add(1,2);
        m1.add(19.7,6.0);

        m1.subtract(4,2);
        m1.subtract(4.5,7.2);

        m1.multiply(2,7);
        m1.multiply(5.7,9.8);

        m1.divide(6,3);
        m1.divide(7.0,3.0);
    }
}
