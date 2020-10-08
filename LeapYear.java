import java.util.*;  
public class LeapYear {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter The year :  ");  
        System.out.println("Enter The year :  ");  
        int year =  sc.nextInt();
        boolean leap = false;

        if((year%400==0) ||(year%4==0&&year%100!=0))//checking for leap year
             leap=true;
        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
} 

