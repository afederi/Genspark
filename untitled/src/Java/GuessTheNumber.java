package Java;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[]args){

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Hello! What is your name?\n\n");

            String name = scan.nextLine();
            String play = "y";


            System.out.print("Well, " + name + ", I am thinking of a number between 1 and 20\n");

            do {
                System.out.print("Take a guess.\n\n");


                int count = 1;
                int random = (int) (Math.random() * (20 - 1)) + 1;
                int guess = scan.nextInt();
                random = 10;

                while (guess != random) {

                    if (guess > random) {
                        System.out.println("\nYour guess is too high\nTake a guess");
                    } else if (guess < random) {
                        System.out.println("\nYour guess is too low\nTake a guess");
                    }
                    System.out.println("\n");
                    guess = scan.nextInt();
                    count++;
                }

                System.out.println("Good job, " + name + " You guessed the number in " + count + " guesses");
                System.out.print("Would you like to play again? (y or n)\n\n");
                play = scan.nextLine();
                while (!play.contains("n") && !play.contains("y")) {
                    play = scan.next();
                }


            } while (!play.equals("n"));
        }catch(Exception e){
            System.out.println("THE ERROR IS: "+e.getMessage());
        }

    }
}
