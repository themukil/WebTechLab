import java.util.Scanner;

public class Q8{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int x=(int)(Math.random() * (20 - 1 + 1))+ 1;
        int y=(int)(Math.random() * (20 - 1 + 1))+ 1;
        System.out.println("The randomly generated numbers are: "+x+","+y);
        int z=x+y;
        
        System.out.println("Sine value: "+Math.sin(z));
        System.out.println("Cosine value: "+Math.cos(z));
        ip.close();
    }
}