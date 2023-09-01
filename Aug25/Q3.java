import java.util.Scanner;

public class Q3{
    public static boolean inArray(int arr[],int toFind){
        for(int n:arr){
            if(n==toFind){
                return true;
            }
        }
        return false;
    }

    public static void printarray(int arr[]){
        for (int element: arr) {
            System.out.print(element+", ");
        }
    }

    public static boolean notinrange(int num){
        if(num<10){
            return true;
        }
        else if(num>100){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        int dup[] = new int[5];
        int param;

        do{
            System.out.print("Enter First Number (between 10 and 100): ");
            dup[0]=ip.nextInt();
        }while(notinrange(dup[0]));

        System.out.println("First unique element: "+dup[0]);
        System.out.print("Array: ");
        printarray(dup);


        for(int i=1;i<5;i++){
            do{
                System.out.print("\nEnter number "+(i+1)+"(between 10 and 100): ");
                param =ip.nextInt();
            }while(inArray(dup,param) || notinrange(param));
            dup[i]=param;
            System.out.println((i+1)+"th unique element: "+param);
            System.out.print("Array: ");
            printarray(dup);
            System.out.println("\n");
        }
        ip.close();

       
    }
}