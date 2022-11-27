import java.text.SimpleDateFormat;

/**
 * Concepts needs to be covered
 * Function overloading
 * Encapsulation
 * Polymorphism
 * Inheritance
 * Abstract Classes
 * Interfaces
 * Design Pattern
 * Exception Handling
 * Threading
 */

public class OopsPlayground {
    public static void main(String[] args) {
        FunctionOverloadingExample foe = new FunctionOverloadingExample();

    }
}


class FunctionOverloadingExample {

    /**
     * Rules for Function/Method Overloading
     * 1. Type of parameters
     * 2. Count of parameters
     * 3. Order of parameters
     * Can we achieve this using return type?
     * No We cannot overload with return type of two different functions
     * https://www.geeksforgeeks.org/method-overloading-in-java/
     */


    //1.Changing the type of parameters
    public void sum(int a,int b) {
        System.out.println("The sum is "+(a+b));
    }

    public void sum(float a, float b) {
        System.out.println("The sum is "+(a+b));
    }

    //2.Changing the count of parameters
    public void sum(int a,int b,int c) {
        System.out.println("The sum is "+(a+b+c));
    }

    //3.Changing the order of parameters
    public void sum(boolean a, String b) {

    }

    public void sum(String a,boolean b) {

    }

//    public int temp() {
//        return 1;
//    }
//
//    public float temp() {
//        return 1.0f;
//    }

}
