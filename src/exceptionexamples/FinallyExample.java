package exceptionexamples;

import javax.sound.midi.Soundbank;

public class FinallyExample {
    public static void main(String[] args) {
        try{
            int a=10;
            int res=a/10;
            System.out.println("res is : "+res);
        } catch (Exception e){
            System.out.println("Exception occurred:"+e.getMessage());
        }
        finally {
            System.out.println("finally block exceuting always");
        }
    }
}
