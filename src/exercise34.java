/**
 * Created by Praktika on 9.11.2016.
 */
import java.util.Random;
import java.util.Scanner;

public class exercise34 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int yourguess, offby;
        int number = random.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        yourguess = in.nextInt();

        System.out.print("Your guess is: ");
        System.out.println(yourguess);
        System.out.print("The number i was thinking of is: ");
        System.out.println(number);

        System.out.print("You were off by: ");
        offby = number - yourguess;
        if (offby < 0)
            offby = -offby;
        System.out.print(offby);

    }
}