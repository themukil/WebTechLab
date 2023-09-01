public class q713{
    
    public static void main(String[] args){
        int sales[][]={{10,20,30,40,50},{100,200,300,400,500},{1000,2000,3000,4000,5000}};
    
    
        for (int row = 0; row < sales.length; row++){
            for (int col= 0; col< sales[row].length; col++){
                System.out.println("Element in "+(row+1)+"th row and "+(col+1)+"th column is being set to 0 now");
                sales[row][col] = 0;
            }
        }
    }
}