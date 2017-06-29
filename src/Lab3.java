import java.util.Scanner;

/**
 * Created by Rizwan on 6/28/2017.
 */
public class Lab3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userInput = " ";


        System.out.println("Learn your squares and cubes!");
        System.out.println("");
        do {

            double square = 0;
            double cube = 0;
            double userNum = 0;
            int counter = 0;
            System.out.print("Enter an integer: ");
            userNum = scan.nextDouble();
            System.out.println("");
            System.out.println("Number\t" + "Squared\t" + "Cubed\t");
            System.out.println("=======\t" + "======\t" + "======\t");
            for (int i = 1; i <= userNum; i++) {
                counter++;
                square = Math.pow(counter, 2);
                cube = Math.pow(counter, 3);
                int pCube = (int) cube;
                int pSquare = (int) square;
                System.out.println(i + "\t" + "\t" + pSquare + "\t" + "\t" + pCube);

            }
            System.out.println("Continue? (y/n): ");
            userInput = scan.next();
        } while (userInput.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");
    }
}
