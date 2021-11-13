/*
Write a program that meets the following requirements: 
a Create an array with 100 randomly chosen integers. 
a Prompts the user to enter the index of the array, 
and then displays the corresponding element value. 
If the specified index is out of bounds, display the message Out of Bounds.
*/


import java.util.Scanner;

public class Test3{

    public static void main(String[] args) {
        
        int arr[] = new int[100];
        for(int i=0 ; i<arr.length ; i++){
            arr[i]=(int)(Math.random()*100);
        }
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the INdex of array : ");
        try{
            System.out.println(arr[in.nextInt()]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out Of Bounds");
        }
        
    }
    
}
