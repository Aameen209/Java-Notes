public class ExceptionHandling {
    public static void main(String[] args) {
        // Try and Catch Example
        int[] marks = {97, 98, 99};

        try {
            // Trying to access an index that does not exist
            System.out.println(marks[90]); // ❌ Throws ArrayIndexOutOfBoundsException (index 90 doesn't exist)
        } catch (Exception exception) {
            // Catch block - handling exception
            // Exception caught here, so the program doesn't crash
            System.out.println("Exception caught: " + exception); // Output: the exception message
        }

        System.out.println("My name is Khan"); // Output: my name is khan (still runs after exception)
    }
}
