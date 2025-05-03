package com.JAVA;

public class Casting {
    public static void main(String[] args) {

        // Implicit Casting: In this case, an int (4 bytes) can fit into a double (8 bytes) without any issues
        double price = 100.00;
        double finalprice = price + 18; // 18 is implicitly cast to double
        System.out.println(finalprice); // Output: 118.0 (18 is automatically cast to a double)

        // Explicit Casting: In this case, we need to manually cast the double to an int, otherwise the decimal part will be lost
        int p = 100;
        int fp = p + (int) 18.99; // 18.99 is explicitly cast to 18 (decimal part lost)
        System.out.println(fp); // Output: 118 (18.99 is truncated to 18)

    }
}

// Constants

// int age = 30;
// age = 31;
// age = 21; // Variable value can be changed

final float pi = 3.14F; // 'final' makes pi a constant; its value can't be changed after initialization
// PI = 1.1F; //  Error: cannot assign a value to final variable 'pi' because it's a constant
