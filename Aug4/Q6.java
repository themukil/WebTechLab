public class Q6 {
    public static void main(String[] args) {
        System.out.println("Number | Square | Cube");
        System.out.println("----------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-6d | %-7d | %-4d%n", i, i * i, i * i * i);
        }
    }
}
