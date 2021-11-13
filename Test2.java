/*
Write a program that prompts the user to read two integers and displays their sum.
Your program should prompt the user to read the number again if the input is incorrect. 
*/



import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num1,num2;
        while(true){
            System.out.println("Enter 2 Numbers :");
            try{
                num1=in.nextInt();
                num2=in.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("you should enter integers numbers.");
                in.nextLine();
            }
        }
        System.out.println("Sum = " + (num1+num2));
    }
    
}
