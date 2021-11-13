/*
Write a program that causes the JVM to throw an OutOfMemoryError 
and catches and handles this error.
*/


public class Test4{

    public static void main(String[] args) {
        
        try{
            int arr[] = new int[1000000000];
        }catch(OutOfMemoryError e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("END");
        
    }
    
}
