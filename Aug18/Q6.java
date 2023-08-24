import java.util.Scanner;

public class Q6{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int r;
        System.out.println("Enter the radius of the sphere: ");
        r = ip.nextInt();

        double Volume = (4/3)*Math.PI*Math.pow(r,3);
        double SurfArea = 4*Math.PI*Math.pow(r,2);
        System.out.printf("Volume of the sphere: %.4f%n", Volume);
        System.out.printf("Surface area of the sphere: %.4f%n", SurfArea);
        ip.close();
    }
}