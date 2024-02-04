import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
        Game
    */
    public static void main(String[] args) {
        int state = 1;
        Scanner scn = new Scanner(System.in);

        System.out.println("Guess number. (1 - 10)");
        while (state == 1) {
            try {
                int hiddenNumber = generateNumber();
                System.out.println(hiddenNumber);
                int userNumber = scn.nextInt();
                if (userNumber > 10 || userNumber < 1) {
                    System.out.println("Wrong range! (1 - 10)");
                } else if (userNumber == hiddenNumber) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Wrong!");
                }
            } catch (Exception ex) {
                try {
                    throw new Exception("Not a number.");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Continue? \n 1 - yes 0 - no");
            state = scn.nextInt();
        }
    }

    /*
        Generator
    */
    private static int generateNumber() {
        Random hiddenNumber = new Random();

        return hiddenNumber.nextInt(1, 10);
    }
}
