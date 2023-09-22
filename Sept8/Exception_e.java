import java.io.IOException;

class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}

public class Exception_e {
    public static void main(String[] args) {
        try {
            // Throw ExceptionA
            throw new ExceptionA("This is an ExceptionA");
        } catch (Exception ex) {
            System.out.println("Caught Exception: " + ex.getMessage());
        }

        try {
            // Throw ExceptionB
            throw new ExceptionB("This is an ExceptionB");
        } catch (Exception ex) {
            System.out.println("Caught Exception: " + ex.getMessage());
        }

        try {
            // Throw a NullPointerException
            throw new NullPointerException("This is a NullPointerException");
        } catch (Exception ex) {
            System.out.println("Caught Exception: " + ex.getMessage());
        }

        try {
            // Throw an IOException
            throw new IOException("This is an IOException");
        } catch (Exception ex) {
            System.out.println("Caught Exception: " + ex.getMessage());
        }
    }
}
