class SomeClass {
    public SomeClass() throws Exception {
        // Simulate a constructor failure by throwing an exception
        throw new Exception("Constructor of SomeClass has failed.");
    }
}

public class ConstructorException {
    public static void main(String[] args) {
        try {
            // Attempt to create an object of SomeClass
            SomeClass someObject = new SomeClass();
        } catch (Exception ex) {
            System.out.println("Caught Exception: " + ex.getMessage());
        }
    }
}
