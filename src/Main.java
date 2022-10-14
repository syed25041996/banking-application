import java.util.Random;
import java.util.Scanner;

/**
 * @author Syed
 */
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
                System.out.println("*******************************************");
                System.out.println("\n 1. Deposit \n 2. Your Balance \n 3. Withdraw");
                System.out.println("*******************************************");

                //Check which option did the user choose
                while(true) {
                    System.out.print("Enter an option: ");
                    int number = sc.nextInt();
                    switch (number) {
                        case 1:
                            System.out.print("How much do you want to deposit: ");
                            int deposit = sc.nextInt();
                            user.setMoney(deposit);
                            continue;
                        case 2:
                            System.out.println("Your total balance is " + user.getMoney());
                            continue;
                        case 3:
                            System.out.print("How much do you want to withdraw ?:  ");
                            int amount = sc.nextInt();
                            user.setMoney(user.getMoney() - amount);
                            continue;
                        default:
                            System.out.println("Bye!!!");
                            System.exit(1);
                    }
                }
            }else{
//                Limit the number of attempts
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