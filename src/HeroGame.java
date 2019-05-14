import java.util.Scanner;

public class HeroGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String heroName = scanner.nextLine();


        System.out.printf("Hello %s, do you want to play this game?%n", heroName);

        System.out.println("If so type yes if you are ready to start");
        scanner.next("yes");

        int healthPoints = 100;
        int potions = 3;
        String weapon = "rusty butter knife";

        System.out.printf("Ok here are your stats:%n Health: %d%n Potions: %d%n Weapon: %s%n", healthPoints, potions, weapon);

        System.out.println("The year is 1848 and as you walk along the Oregon Trail,\n you hear a noise coming from the bushes what do you do?");
        System.out.println("1: Investigate the noise.(and possibly die)");
        System.out.println("2: Continue on your way home.(and make it home safely)");

        int choice1 = scanner.nextInt();

        if (choice1 == 1) {
            Bear();
        }
        if (choice1 == 2) {
            madeItHome();
        }
    }

    public static void Bear() {
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("So you decided to investigate the bushes, here's why you shouldn't have");
        System.out.println("From behind the bushes a grizzly bear awakens and looks directly at you");
        System.out.println("what do you wish to do?");
        System.out.println("1: Attack the bear");
        System.out.println("2: Run");

        int choice2 = scanner2.nextInt();

        if (choice2 == 1){
            attack();
        }
        if (choice2 == 2){
            noRunning();
        }
    }

    public static void attack(){
        System.out.println("Before you have a chance to attack the bear slashes your face");
        System.out.println("Now blinded by blood in your eyes, it's inevitability you'll meet your demises.");
        System.out.println("As predicted you are slain by the bear.");
        System.out.println("R.I.P");
    }

    public static void noRunning() {
        System.out.println("You can't outrun a bear in 1848");
        System.out.println("You are attacked and slain by the bear");
        System.out.println("R.I.P");
    }

    public static void madeItHome() {
        System.out.println("You make it home safe, and all is well.");
    }

}
