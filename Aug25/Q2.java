import java.util.Scanner;

public class Q2{
    public static void printarray(int arr[]){
        for (int element: arr) {
            System.out.print(element+", ");
        }
    }

    public static void main(String[] args){
        System.out.println("a) Set the 10 elements of integer array `counts` to zero");
        int counts[]={10,23,11,34,22,67,85,52,59,53};
        System.out.println("`counts` array before: ");
        printarray(counts);
        
        for(int i=0;i<counts.length;i++){
            counts[i]=0;
        }
        System.out.println("\n`counts` array after: ");
        printarray(counts);
        System.out.println("\n");

        System.out.println("b) Add one to each of the elements in the integer array `bonus`");
        int bonus[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("`bonus` array before: ");
        printarray(bonus);

        for(int i=0;i<bonus.length;i++){
            bonus[i]+=1;
        }

        System.out.println("\n`bonus` array after: ");
        printarray(bonus);
        System.out.println("\n");

        System.out.println("c) Display the five values of integer arary `bestScores` in column format");
        int bestScores[]={10,11,12,13,14,15};
        System.out.println("`bestScores` array before: ");
        printarray(bestScores);
        System.out.println("\n");

        for(int i=0;i<5;i++){
            System.out.println(bestScores[i]);
        }
    }
}