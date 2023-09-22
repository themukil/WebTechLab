import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Student implements Serializable {
    private String studentID;
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String studentID, String firstName, String lastName, double gpa) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + "\n" +
               "First Name: " + firstName + "\n" +
               "Last Name: " + lastName + "\n" +
               "GPA: " + gpa + "\n";
    }
}

public class StudentDatabase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Enter student information (or 'exit' to quit):");
            System.out.print("Student ID: ");
            String studentID = input.nextLine();

            if (studentID.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("First Name: ");
            String firstName = input.nextLine();
            System.out.print("Last Name: ");
            String lastName = input.nextLine();
            System.out.print("GPA: ");
            double gpa = Double.parseDouble(input.nextLine());

            Student student = new Student(studentID, firstName, lastName, gpa);
            students.add(student);
        }

        
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            outputStream.writeObject(students);
            System.out.println("Data has been serialized and saved to students.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("students.ser"))) {
            ArrayList<Student> deserializedStudents = (ArrayList<Student>) inputStream.readObject();
            System.out.println("Deserialized Student Data:");
            for (Student student : deserializedStudents) {
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

