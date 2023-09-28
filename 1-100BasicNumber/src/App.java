import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner inputer = new Scanner(System.in);
        System.out.print("Enter your starting number: ");
        int from = inputer.nextInt();
        System.out.print("Enter your ending number: ");
        int to = inputer.nextInt();
        int total = 0;
        for(int i=from; i<=to; i++){
            int count = 0;

            for(int j =1; j<=i; j++){
                if(i % j == 0){
                    count++;
                }
            }


            if(count == 2){
                total++;
                System.out.println(i + " ");
            }
        }
        System.out.println("total prime number from "+0+" to "+100+" is: "+ total);

    }
}
