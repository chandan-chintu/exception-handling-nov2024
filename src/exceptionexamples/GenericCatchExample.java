package exceptionexamples;

public class GenericCatchExample {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            int arr[] ={2,44,1,45};
            System.out.println("arr element at 6th index : "+arr[6]);
            int b=10/0;
            System.out.println("b value is : "+b);
            System.out.println("end of try block");
        } catch (Exception e){
            System.out.println("Exception occured : "+e.getMessage());
        }
        System.out.println("After multiple catch blocks");
    }
}
