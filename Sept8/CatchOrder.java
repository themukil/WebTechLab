public class CatchOrder {
    public static void main(String[] args) {
        try {
            // Simulate a division by zero (ArithmeticException)
            int result = 10 / 0;
        } catch (Exception ex) {
            System.out.println("Caught Exception: " + ex.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println("Caught ArithmeticException: " + ae.getMessage());
        }
    }
}
