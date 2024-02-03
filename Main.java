import java.util.Random;

public class Main {
    /*
        Generator
    */
    private static int generateNumber() {
        Random hiddenNumber = new Random();

        return hiddenNumber.nextInt(1, 10);
    }
}
