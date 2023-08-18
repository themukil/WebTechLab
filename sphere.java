import java.util.Scanner;

public class sphere{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int r;
        System.out.println("Enter the radius of the sphere: ");
        r = ip.nextInt();

        double Volume = (4/3)*Math.PI*Math.pow(r,3);
        double SurfArea = 4*Math.PI*Math.pow(r,2);
        System.out.println("The Volume of the Sphere is: "+Volume);
        System.out.println("The Surface Area of the Sphere is: "+SurfArea);
        ip.close();
    }
}