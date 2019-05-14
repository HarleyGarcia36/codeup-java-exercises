import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        {
            double pi = 3.14159;
            System.out.format("The value of pi is approximately %.2f.%n", pi);
        }
        {
            //takes user input of numbers and words.
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number");

            int number = input.nextInt();

            System.out.println("Enter three words");

            String word1 = input.next();
            String word2 = input.next();
            String word3 = input.next();


            System.out.printf("Your number is: %d.%n", number);

            System.out.printf("Your word is: %s %s %s.%n", word1, word2, word3);
        }
        {
            //takes user input in a sentence.
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a sentence");
            String sent = input.nextLine();

            System.out.printf("Your sentence is: %s.%n", sent);
        }
        {
            //calculates area & perimeter based off user input.
            Scanner input = new Scanner(System.in);

            System.out.println("What do you think the area/perimeter of the class room is?");
            System.out.println("Enter a length");
            int length = input.nextInt();

            System.out.println("Enter a width");
            int width = input.nextInt();

            int area = length * width;
            int perimeter = (length * 2) + (width * 2);

            System.out.printf("The area of the class room is: %d.%n", area);
            System.out.printf("The perimeter of the class room is: %d.%n", perimeter);

        }
    }
}
