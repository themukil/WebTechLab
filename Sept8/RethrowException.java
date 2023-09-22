public class RethrowException {
    public static void someMethod2() throws Exception {
        // Simulate an exception
        throw new Exception("Exception in someMethod2");
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2(); // Call someMethod2, which throws an exception
        } catch (Exception ex) {
            System.out.println("Caught exception in someMethod");
            // Rethrow the caught exception
            throw ex;
        }
    }

    public static void main(String[] args) {
        try {
            someMethod(); // Call someMethod, which rethrows the exception
        } catch (Exception ex) {
            System.out.println("Caught rethrown exception in main");
            ex.printStackTrace(); // Print the stack trace of the rethrown exception
        }
    }
}
