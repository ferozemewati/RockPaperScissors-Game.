import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {

        System.out.println("Attention please! Now we are going  to play Rock Paper Scissor.");
        System.out.println("Please choose:-\n\t0 for Rock\n\t1 for Paper\n\t2 for Scissor");

        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        System.out.print("It's your turn: ");
        int user_input = sc.nextInt();
        switch (user_input) {
            case 0 -> System.out.println("You selected Rock.");
            case 1 -> System.out.println("You selected Paper.");
            case 2 -> System.out.println("You selected Scissor.");
        }

        System.out.print("It's computer's turn: ");
        int computer_input = ra.nextInt(3);
        System.out.println(computer_input);
        switch (computer_input) {
            case 0 -> System.out.println("Computer selected Rock.");
            case 1 -> System.out.println("Computer selected Paper.");
            case 2 -> System.out.println("Computer selected Scissor.");
        }

        if (user_input == computer_input) {
            System.out.println("Match Draw!");
        } else if ((user_input == 0 && computer_input == 2) || (user_input == 1 && computer_input == 0) || (user_input == 2 && computer_input == 1)) {
            System.out.println("Congratulations, You won!");
        } else {
            System.out.println("You lose! Better luck next time.");
        }
    }
}
