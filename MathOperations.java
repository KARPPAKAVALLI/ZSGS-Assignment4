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
    public void add(float x,float y){
        System.out.println(x+y);
    }

    public void subtract(int a,int b){
        System.out.println(a-b);
    }

    public void subtract(double a,double b){
        System.out.println(a-b);
    }

    public void subtract(float a,float b){
        System.out.println(a-b);
    }

    public void multiply(int n,int m){
        System.out.println(n*m);
    }

    public void multiply(double n,double m){
        System.out.println(n*m);
    }

    public void multiply(float n,float m){
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

    public void divide(float i,float j){
        if(j!=0)
            System.out.println(i/j);
        else
            System.out.println("Error, Cant divide by zero");
    }

    public void remainder(int p,int q){
        if(q!=0)
            System.out.println(p%q);
        else
            System.out.println("Error, Cant divide by zero");
    }

    public void remainder(double p,double q){
        if(q!=0)
            System.out.println(p%q);
        else
            System.out.println("Error, Cant divide by zero");
    }

    public void remainder(float p,float q){
        if(q!=0)
            System.out.println(p%q);
        else
            System.out.println("Error, Cant divide by zero");
    }

}
