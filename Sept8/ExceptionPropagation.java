public class ExceptionPropagation {

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (ArithmeticException ex) {
            System.out.println("Caught ArithmeticException in main: " + ex.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }

    public static void someMethod() {
        try {
            int result = 10 / 0; // This line will throw an ArithmeticException
        } catch (NullPointerException ex) {
            System.out.println("Caught NullPointerException in someMethod: " + ex.getMessage());
        }

        // This method doesn't catch ArithmeticException; it propagates up.
    }
}
