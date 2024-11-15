package exceptionexamples;

public class ThrowExample {

    public static void sample(){
        System.out.println("inside sample method before throwing exception");
        int a=10;
        if(a==10){
            throw new RuntimeException("Some exception message");
        }
        System.out.println("a value is : "+a);
    }

    public static void main(String[] args) {
        try{
            ThrowExample.sample();
        } catch (Exception e){
            System.out.println("Exception occured : "+e.getMessage());
        }
    }
}
