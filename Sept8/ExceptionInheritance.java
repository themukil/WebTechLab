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

class ExceptionC extends ExceptionB {
    public ExceptionC(String message) {
        super(message);
    }
}

public class ExceptionInheritance {
    public static void main(String[] args) {
        try {
            // Simulate an ExceptionC being thrown
            throw new ExceptionC("This is an ExceptionC");
        } catch (ExceptionA exA) {
            System.out.println("Caught ExceptionA: " + exA.getMessage());
        }
    }
}
