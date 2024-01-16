import java.util.*;

class Game{

    public void guessNumber() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int RandomNumber = random.nextInt(100) + 1;
        System.out.println("Welcome to Number Game!");
        System.out.println();
        System.out.println("Guess the Number between 1 to 100");
        int Count = 0;

        // logic

        while (true) {
            System.out.println(" enter a Number.");
            int user = sc.nextInt();
            Count++;
            if (user < 1 || user > 100)
                System.out.println("Your guess is out of bounds. Try again.");
            else if (RandomNumber == user) {
                System.out.println("Congrats! you Guess it Correct in " + Count + " tries");
                break;
            } else if (RandomNumber > user)
                System.out.println("Think a Higher Number");
            else
                System.out.println("Think a Lower Number");
        }
    }

    public static void main(String args[]) {
        Game ob = new Game();
        ob.guessNumber();
    }
}