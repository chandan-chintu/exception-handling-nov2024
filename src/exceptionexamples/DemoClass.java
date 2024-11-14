package exceptionexamples;

public class DemoClass {
    public static void main(String[] args) {
        // this class shows the example for the exceptions unhandled case
        int a=10;
        int b=a/0; // division by zero
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
    }
}
