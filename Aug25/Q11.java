class Employee {
    private String firstName;
    private String lastName;
    private String ssn;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + ", SSN: " + ssn;
    }
}

class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String ssn, double wage, int pieces) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return super.toString() + ", Wage: $" + wage + ", Pieces: " + pieces;
    }
}

public class Q11 {
    public static void main(String[] args) {
        PieceWorker pieceWorker = new PieceWorker("John", "Doe", "123-45-6789", 12.5, 100);
        System.out.println(pieceWorker.toString());
    }
}
