package javaCollege.lecture;

//BufferedReader class

import java.io.*;

public class Prac4 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // input of numbers
        System.out.print("Enter 1st number : ");
        int num1 = Integer.parseInt(bf.readLine());
        System.out.print("Enter 2nd number : ");
        int num2 = Integer.parseInt(bf.readLine());

        //print sum
        System.out.println("Sum is " + (num1 + num2));
    }

}