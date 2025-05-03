package com.JAVA;
import java.awt.datatransfer.StringSelection;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // 1-D Arrays
        int age = 30; // simple variable
        int english = 100;
        int math = 70;
        int[] marks = new int[3]; // declaring an integer array of size 3
        marks[0] = 100;
        marks[1] = 70;
        System.out.println(marks[1]); // Output: 70 (printing 2nd element of the array)

        // Another example with different values
        int englishMarks = 110;
        int mathMarks = 70;
        int gkMarks = 90;
        int[] marksArray = new int[3]; // array to store 3 subject marks
        marksArray[0] = 110;
        marksArray[1] = 70;
        marksArray[2] = 90;

        // Length of the array
        System.out.println(marksArray.length); // Output: 3 (total number of elements in the array)

        // Sorting the array
        System.out.println(marksArray[0]); // Output: 110 (before sorting)
        Arrays.sort(marksArray); // sorts the array in ascending order
        System.out.println(marksArray[0]); // Output: 70 (first element after sorting)

        // 2-D Arrays (without using the 'new' keyword if values are known)
        int[] englishMarksArray = {97, 98, 95}; // 1D array of English marks
        int[] mathsMarksArray = {90, 91, 92}; // 1D array of Math marks

        // 2D array combining both English and Math marks
        int[][] finalMarks = {{97, 98, 95}, {90, 91, 92}}; // 2D array combining both
        System.out.println(finalMarks[1][2]); // Output: 92 (3rd value from 2nd row i.e., mathsMarksArray)

    }
}
