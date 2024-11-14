package exceptionexamples;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String msg1 = "hi hello";
            String msg2 = null;
            System.out.println("Length of msg1 is : " + msg1.length());
            System.out.println("Length of msg2 is : " + msg2.length());
        }catch (NullPointerException e2){
            System.out.println("Exception occured : "+e2.getMessage());
        }
    }
}
