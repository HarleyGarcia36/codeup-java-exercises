import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }



//        {
//            int s = 0;
//            do {
//                int squared = s * s;
//                if (squared % 2 == 0)
//                System.out.println(squared);
//                s++;
//            } while (s < 200);
//        }



//        {
//            for (int i = 0; i <= 100; i++) {
//                System.out.println(i);
//                if (i % 3 == 0) {
//                    System.out.println("Fizz");
//                    continue;
//                }
//                if (i % 5 == 0) {
//                    System.out.println("Buzz");
//                    continue;
//                }
//                if (i % 15 == 0) {
//                    System.out.println("FizzBuzz");
//                    continue;
//                }
//             }
//        }

//        for (int i = 0; i <= 2000; i++ ) {
//            System.out.println(i);
//        }
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your grade percentage?");

        int userGrade = scanner.nextInt();

        System.out.print(userGrade);

    }
}