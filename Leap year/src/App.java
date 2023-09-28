
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner mainInputer = new Scanner(System.in);
        
        System.out.print("To know Leap Year or not Type your year: ");
        int year = mainInputer.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a Leap Year");
        }
        else{
            System.out.println(year +" is not a Leap Year");
        }
        





    }
}
