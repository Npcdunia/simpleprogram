import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.println("Welcome To My Game");
            System.out.println("===== Game Tebak Angka =====");
            System.out.print("Pilih angka 1-10 : ");

            int random = rand.nextInt(10) + 1; // menghasilkan angka 1–10
            int player = input.nextInt();

            if (player == random) {
                System.out.println("You win!");
                System.out.println("Angkanya adalah " + random);

                break;
            } else {
                System.out.println("You lose!");
                System.out.println("Angkanya adalah " + random);
            }

            System.out.println();
        }

        input.close();
    }
}
