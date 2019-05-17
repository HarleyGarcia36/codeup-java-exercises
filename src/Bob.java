import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
//      Ask if they wanna talk to Bob
        System.out.println("Do you want to talk to Bob?");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//      Look for an answer
        String answer = sc.next();
//      If they say yes... start conversation
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Say something.");
            String userInput;
            do {
                userInput = sc.next();
                if (userInput.endsWith("?")) {
                    System.out.println("Sure.");
                } else if (userInput.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (userInput.equals("")) {
                    System.out.println("Fine.Be that way!");
                } else {
                    System.out.println("Whatever");
                }
            }while(!userInput.equals("You're grounded!"));
        }
    }
}
