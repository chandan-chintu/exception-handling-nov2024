package exceptionexamples;

public class SampleMainClass {
    public static void main(String[] args) {
        try{
            int a=10;
            if(a==10){
                throw new MyOwnException("User defined exception");
            }
        }catch (Exception e){
            System.out.println("Exception occurred : "+e.getMessage());
        }
    }
}
