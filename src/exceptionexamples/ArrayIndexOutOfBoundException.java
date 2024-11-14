package exceptionexamples;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 34, 46, 77};
            System.out.println("Array length is : " + arr.length);
            System.out.println("Array element at 2nd index is : " + arr[2]);
            System.out.println("Array element at 4th index is : " + arr[4]);
        }catch (ArrayIndexOutOfBoundsException e3){
            System.out.println("Exception occured : "+e3.getMessage());
        }
    }
}
