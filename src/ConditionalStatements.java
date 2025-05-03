package com.JAVA;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

        // Conditional statement
        boolean isSunUp = true;
        if (isSunUp == true)
            System.out.println("day"); // Output: day (because isSunUp is true)
        else
            System.out.println("Night");

        int age = 30;
        if (age < 18)
            System.out.println("Minor");
        else
            System.out.println("Major"); // Output: Major (30 > 18)

        // Conditional statements with user input
        Scanner sc = new Scanner(System.in);
        // pen = 10; notebook = 40
        int cash = sc.nextInt(); // user input
        if (cash < 10) {
            System.out.println("can't buy anything");
            System.out.println("get more cash");
        } else if (cash > 10 && cash < 500) {
            System.out.println("can get 3 things");
        } else {
            System.out.println("get all things");
        }

        // *********  Switch Statements   ***********
        int day = 3; // 1-monday; 2-tuesday; 3-wednesday

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break; // breaks after this case
            case 3:
                System.out.println("wednesday"); // Output: wednesday (case 3 matched)
                break;
            default:
                System.out.println("thur-sun");
        }

        // Break and Continue
        int i = 0;
        while (true) {
            if (i == 3) {
                i = i + 1;
                continue; // skips printing 3 and continues loop
            }
            System.out.println(i); // Output: 0 1 2 4 5
            i = i + 1;
            if (i > 5) {
                break; // exits loop when i > 5
            }
        }
    }
}
