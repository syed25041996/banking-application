import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Account user = new Account("Syed", RandomId.getRandomId());

        System.out.println("\n****************************************\nWelocme to Sbank\n***************************************");

        //Login
        Scanner sc = new Scanner(System.in);

        Integer tries = 0;
        Integer attempts = 3;

        while(true){
            System.out.print("Please enter your username:  ");
            String username = sc.next();

            System.out.print("Please enter your id:  ");
            String id = sc.next();

            if(username.equals(user.getName()) && id.equals(user.getId())){
                System.out.println("Welcome " + user.getName() + " what would you like to do ?");
                break;
            }else{
                System.out.println(attempts + " attempts left");
                attempts--;
                tries++;
                // Conditon for trying to log in too many times
                if(tries > 3){
                    System.out.println("Too many attempts, you are being logged out");
                    break;
                }

            }

        }

    }
}