package com.JAVA;
import java.util.Scanner;

public class Takinginput {
   public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Your Age : ");
        float age = sc.nextFloat(); // Take age as float
        System.out.println(age); // Print the entered age

        System.out.println("Input Your Name : ");
        String name = sc.next(); // Take name (single word)
        System.out.println(name); // Print the entered name

        System.out.println("Input Your Full Name : ");
        String name1 = sc.nextLine(); // Take full name (entire line)
        System.out.println(name1); // Print the entered full name
   }
}
