package com.JAVA;

public class Datatypes {
    public static void main(String[] args) {
        // Primitive data types
        // byte - 1 byte - [-128 to 127]
        // short - 2 byte
        // int - 4 byte [1,2,3,...]
        // long - 8 byte
        // float 4 byte [3.14]
        // double - 8 byte
        // char - 2 byte [a,b,c,d]
        // boolean - 1 byte [true/false]

        // Example of primitive data types:
        byte age = 30; // small whole number
        int phone = 1234567890; // 10-digit number
        long phone2 = 1234567890000L; // large number with L suffix
        float pi = 3.14F; // F suffix for float
        char letter = '@'; // single character
        boolean isAdult = false; // true or false

        // Non-primitive types: String example
        // String length function
        String name = "Aameen";
        System.out.println(name.length()); // Output: 6 (number of characters in the string)

        // Strings: Concatenate example
        String name1 = "Mohd";
        String name2 = "Aameen";
        String name3 = "Khan";
        String name4 = name1 + name2 + name3;
        System.out.println(name4); // Output: MohdAameenKhan (joined strings)

        // String charAt example
        System.out.println(name.charAt(5)); // Output: 'n' (character at index 5)

        // String replace example
        String name5 = "mohd";
        String name6 = name5.replace('h','o');
        System.out.println(name6); // Output: mood (replaces 'h' with 'o')

        // String substring example
        String name7 = "MOhd and Aameen";
        System.out.println(name7.substring(4,8)); // Output: " and" (from index 4 to 7)
    }
}
