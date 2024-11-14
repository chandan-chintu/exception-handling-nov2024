package exceptionexamples;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            int arr[] ={2,44,1,45};
            System.out.println("arr element at 2nd index : "+arr[2]);
            int b=10/0;
            System.out.println("b value is : "+b);
            System.out.println("end of try block");
        } catch (ArithmeticException e1){
            System.out.println("Exception Occured : "+e1.getMessage());
        } catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("Exception Occured : "+e2.getMessage());
        }
        System.out.println("After multiple catch blocks");
    }
}
