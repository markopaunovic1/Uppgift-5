import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner level = new Scanner(System.in);
        System.out.println("Welcome to HiLo");
        System.out.println("Choose a Level between 1-3 ");

        // Användare skriver in vilken level vill spela

        int chooseLvl = level.nextInt();
        System.out.println("level " + chooseLvl + " initiated");

        // Datorn frågar att gissa ett nummer

        System.out.println("Guess a number between 1-10");

        // Användare ska läsa in ett tal

        int userNumber = level.nextInt();

        // Datorn ska läsa ut ett random tal

        Random random = new Random();

        int randomNumber = random.nextInt(11);
        System.out.print(random.nextInt(randomNumber));

        // Om Användare gissar rätt, datorn visar rätt, om det är fel, försök igen

        if (randomNumber == userNumber) {
            System.out.println("was correct!");
        } else
            System.out.println(" , try again");

    }
}








