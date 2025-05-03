package com.JAVA;

import java.sql.SQLOutput;

public class operators {
    public static void main(String[] args) {

        //*********Arithmetic operators*************
        
        //1. Addition
        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println(sum); // Output: 3 (sum of a and b)

        //2. Subtraction
        int sub = b - a;
        System.out.println(sub); // Output: 1 (b - a = 3 - 2)

        //3. Multiplication
        int mul = a * b;
        System.out.println(mul); // Output: 3 (multiplication of a and b)

        //4. Division
        int div = b / a;
        System.out.println(div); // Output: 2 (integer division)

        // Note: No decimal part shown for integer division
        div = a / b;
        System.out.println(div); // Output: 0 (since it's integer division)

        // 0. ke baad wali nahi dega usko delete kar deta hai
        div = a / b;
        System.out.println(div); // Output: 2

        // 0. ke baad wali bhi print karega isme
        double divDecimal = a / b;
        System.out.println(divDecimal); // Output: 0.5 (decimal division, keeps the fractional part)

        //5. Modulo (remainder) operator
        double modulo = b % a;
        System.out.println(modulo); // Output: 6.0 (remainder when 20 is divided by 7)
    }

    //***************Assignment Operator****************(=)
    int numb = 5;
    System.out.println(numb++); // Output: 5 (post-increment, prints the current value first)
    System.out.println(numb);  // Output: 6 (after increment)

    System.out.println(++numb); // Output: 6 (pre-increment, increments and then prints the value)
    System.out.println(numb); // Output: 6 (current value after increment)

    int numb2 = 1;
    System.out.println(numb2--); // Output: 1 (post-decrement, prints the current value first)
    System.out.println(numb2);  // Output: 0 (after decrement)

    System.out.println(--numb2); // Output: 0 (pre-decrement, decrements and then prints the value)
    System.out.println(numb2); // Output: 0 (current value after decrement)

    //******************Comparison Operators**************
    //a == b  // equal to
    //a != b  // not equal to
    //a < b   // less than
    //a > b   // greater than
    //a <= b  // less than or equal to
    //a >= b  // greater than or equal to

    //**************Logical Operators***********

    //1. AND (&& or AND) (Both conditions must be true)
    int a1 = 40;
    int b1 = 20;
    if (a1 < 50 && b1 < 30)
        System.out.println("Both are true"); // Output: Both are true

    //2. OR (|| or OR) (At least one condition is true)
    int a2 = 10;
    int b2 = 20;
    if (a2 >= 10 || b2 <= 30)
        System.out.println("At least one is true"); // Output: At least one is true
    else
        System.out.println("False");

    //3. NOT (! or NOT)
    boolean isAdult = false;
    if (!isAdult)
        System.out.println("Is Adult"); // Output: Is Adult
    else
        System.out.println("Not Adult"); // Output: Not Adult
}
