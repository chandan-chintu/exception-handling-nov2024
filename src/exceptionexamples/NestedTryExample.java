package exceptionexamples;

public class NestedTryExample {
    public static void main(String[] args) {
        // try block inside another try block
        try{
            System.out.println("Inside 1st try block");
            int a= 10;
            int res=a/0;
            System.out.println("a value is : "+a);
            System.out.println("res value is : "+res);
            try{
                System.out.println("inside 2nd try block");
                int arr[]={1,4,2,6};
                System.out.println("arr element at 2nd position : "+arr[2]);
                try{
                    System.out.println("inside 3rd try block");
                    String msg1=null;
                    System.out.println("length of msg1 is : "+msg1.length());
                }catch (NullPointerException e1){
                    System.out.println("3rd catch block");
                    System.out.println("Exception Occured : "+e1.getMessage());
                }
            }catch (ArrayIndexOutOfBoundsException e1){
                System.out.println("2nd catch block");
                System.out.println("Exception Occured : "+e1.getMessage());
            }
        }catch (ArithmeticException e1){
            System.out.println("1st catch block");
            System.out.println("Exception Occured : "+e1.getMessage());
            try{
                System.out.println("inside 3rd try block");
                String msg1=null;
                System.out.println("length of msg1 is : "+msg1.length());
            }catch (NullPointerException e2){
                System.out.println("3rd catch block");
                System.out.println("Exception Occured : "+e2.getMessage());
            }
        }
    }
}
