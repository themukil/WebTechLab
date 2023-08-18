import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        String city, country;
        System.out.println("Enter the city name: ");
        city = ip.nextLine();
        System.out.println("Enter the country name: ");
        country = ip.nextLine();

        String temp= country.substring(0,2);
        int n=(int)(Math.random() * (100 - 1 + 1))+ 1;
        String s=String.valueOf(n);
        String pincode = temp+","+city+","+s;
        System.out.println("The Pincode of the city is: "+pincode);
        ip.close();
    }
}
