/*
Write a program that reads the first 5 values from 
this file and prints them along with their sum.
*/



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test1 {
public static void main(String[] args) throws FileNotFoundException{
    File f = new File("c:/file.txt");
    Scanner in = new Scanner(f);
    double sum = 0.0;
    while (in.hasNextDouble()){
        double num = in.nextDouble();
        System.out.println("number = " + num);
        sum += num;
    }
    System.out.println("Sum = " + sum);
  
}
}

