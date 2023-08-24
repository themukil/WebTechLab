import java.util.Scanner;

public class Q5{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int x1,x2,y1,y2;
        
        System.out.println("Enter x1: ");
        x1 = ip.nextInt();
        System.out.println("Enter x2: ");
        x2 = ip.nextInt();
        System.out.println("Enter y1: ");
        y1 = ip.nextInt();
        System.out.println("Enter y2: ");
        y2 = ip.nextInt();
    
        double m = (y2-y1)/(x2-x1);
        System.out.println("The slope of the line is: "+m);
        ip.close();
    }
}