import java.util.Scanner;

public class Q9{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int a=(int)(Math.random() * (30 - 1 + 1))+ 1;
        int b=(int)(Math.random() * (30 - 1 + 1))+ 1;
        int h=(int)(Math.random() * (30 - 1 + 1))+ 1;
        System.out.println("The randomly sides and height are: "+a+","+b+","+h);
        double area=b*h;
        double perimeter=2*(a+b);
        
        System.out.println("The Area of the Parallelogram is: "+area);
        System.out.println("The Perimeter of the Parallelogram is: "+perimeter);
        ip.close();
    }
}