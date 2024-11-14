package exceptionexamples;

public class TryAndCatchExample {
    public static void main(String[] args) {
        int a=10;
        int res=0;
        try{
            //code to monitor
            System.out.println("Inside try block before exception occurs");
             res=a/0; // division by zero
            System.out.println("Inside try block after exception occurs");
        } catch (ArithmeticException e1){
            // handle the exception
            System.out.println("Exception occured : "+e1.getMessage());
        }
        System.out.println("a value is : "+a);
        System.out.println("b value is : "+res);
    }
}
