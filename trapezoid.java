import java.util.Scanner;

public class trapezoid{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int a,b,h;
        System.out.println("Enter the length of side 1: ");
        a = ip.nextInt();
        System.out.println("Enter the lenght of side 2: ");
        b = ip.nextInt();
        System.out.println("Enter the vertical length: ");
        h = ip.nextInt();

        float area = ((a+b)/2)*h;
        System.out.println("The Area of the Trapezoid is: "+area);
        ip.close();
    }
}