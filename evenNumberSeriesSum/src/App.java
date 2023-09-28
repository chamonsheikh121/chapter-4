
// this code is same for even number, odd number, and general number series sum; just change the the value in loop for even number i = 2 and i+=2; for odd number i = 1 and i+=2; for general number i = 1 or 0 and i++


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner mainInput = new Scanner(System.in);

        System.out.print("Enter How much even number you want to sum: ");
        int endNumber = mainInput.nextInt();
        if (endNumber < 2) {
            System.out.println("Your number can't be less than 2 . Because 1 & 0 are not even number");
        } else {
            int sum = 0;
            for (int i = 1; i <= endNumber; i++ ) {
                sum = sum + i;
            }


            System.out.print("The sum of even number till " + endNumber +" is: " + sum);

            

        }

    }
}
