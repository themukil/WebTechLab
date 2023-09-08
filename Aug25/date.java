import java.util.Scanner;

public class date{
    public static String month(int x){
        switch(x){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return null;
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int day,month,year;

        System.out.println("Enter the day: ");
        day = ip.nextInt();
        System.out.println("Enter the month: ");
        month = ip.nextInt();
        System.out.println("Enter the year: ");
        year = ip.nextInt();

        System.out.println("Initial date format: "+month+"/"+day+"/"+year);
        System.out.println("Modified date format: "+month(month)+" "+day+", "+year);
    }
}
