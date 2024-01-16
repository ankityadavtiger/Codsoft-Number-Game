import java.util.*;

class YourAccount {
    Scanner sc = new Scanner(System.in);
    int money = 50000;

    public void user() {
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "! How can I help you?");
        System.out.println();
    }

    public void input() {
        int ch;
        do {
            System.out.println("Enter 1. for Checking Balance: ");
            System.out.println("Enter 2. for Diposite Balance: ");
            System.out.println("Enter 3. for Withdrawl Balance: ");
            System.out.println("4 for exit.");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposite();
                    break;
                case 3:
                    withdrawl();
                    break;
                case 4:
                    System.out.println("Thanks for using Atm!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("you entered wrong choice");
            }
        } while (ch != 4);
    }

    public void checkBalance() {
        System.out.println("your Balance: " + money);
        System.out.println();
    }

    public void deposite() {
        System.out.println("Enter your Amount to be Deposite");
        int dep = sc.nextInt();
        System.out.println("Deposit successfully done!");
        System.out.println();
        System.out.println("Current Balance: " + (money + dep));
        System.out.println();
    }

    public void withdrawl() {
        System.out.println("Enter Your Withdrwl Amount: ");
        int wit = sc.nextInt();
        if (wit > money) {
            System.out.println("Not enough Balance! Try again");
            System.out.println();
        } else {
            System.out.println("Withdrawl successfully!");
            System.out.println();
            System.out.println("Current Balance: " + (money - wit));
            System.out.println();
        }
    }

}

class Interface {
    public static void main(String args[]) {
        YourAccount obj = new YourAccount();
        obj.user();
        obj.input();
    }
}