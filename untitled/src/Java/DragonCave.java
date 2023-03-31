package Java;

import java.util.Scanner;

public class DragonCave {
    public static void main(String[]args){
        try {
            Scanner scan = new Scanner(System.in);

            String prompt = "You are in a land full of Dragons. In front of you,\n" +
                    "you see two caves. In one cave, the dragon is friendly\n" +
                    "and will share his treasure with you. The other dragon\n" +
                    "is greedy and hungry and will eat you on sight.\n" +
                    "Which cave will you go into? (1 or 2)";

            String prompt2 = "Your approach the cave...\n" +
                    "It is dark and spooky.\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and...";
            String choice1 = "Gobbles you in one bite!";
            String choice2 = "Breaths fire to the candles showing you the treasure he sits on";

            System.out.print(prompt + "  ");
            int choice = scan.nextInt();

            //This while loop will make sure that the user chooses 1 or 2
            while (choice != 1 && choice != 2) {
                System.out.println("Wrong choice");
                choice = scan.nextInt();
            }

            System.out.println("\n" + prompt2);
            if (choice == 1) {
                System.out.print(choice1);
            } else if (choice == 2) {
                System.out.print(choice2);
            }
        }catch (Exception e){
            System.out.println("THE ERROR IS: "+e.getMessage());
        }




    }
}
