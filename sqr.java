import java.util.Scanner;

public class sqr{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int a,b=1;
        for(int i=0; i<3; i++){
            System.out.println("Enter number "+i+": ");
            a = ip.nextInt();
            b*=a;
        }

        int c=b*b;
        System.out.println("The square of product of 3 numbers is: "+c);
        ip.close();
    }
}