package ui;

import haikuChecker.HaikuChecker;
import haikuChecker.HaikuPoem;

import java.util.Scanner;

public class Menu {
    private Scanner inputFromUser;
    private HaikuChecker checker = new HaikuChecker();

    public Menu(){ // Construktor for Menu, with a scanner.
        this.inputFromUser = new Scanner(System.in);
    }

    public void welcomeToApp(){ // welcome message, primarily a tester for early coding.
        System.out.println("Welcome to the haiku-app!");
    }

    public boolean anotherHaiku (){ // Set up a checker for the while loop, so we can keep making more poems untill we dont want anymore.
        System.out.println("Would you like to make another poem?\n1 for yes, 2 for no.");
        String answer = inputFromUser.nextLine();
        if (answer.equals("1")){
            return true;
        } else {
            return false;
        }
    }

    public void typeInHaikuPoem(){ // Creator method for our haiku Poems.
        boolean keepMakingPoems = true; // while loop enabler, as long as it's true it'll keep looping through our scanner and construktor for poems.
        while (keepMakingPoems) {
            System.out.println("Type in your name.");
            String name = inputFromUser.nextLine();
            System.out.println("Type in the first line of your haiku.");
            String firstLineFromUser = inputFromUser.nextLine();
            System.out.println("Type in the second line of your haiku.");
            String secondLineFromUser = inputFromUser.nextLine();
            System.out.println("Type in the third line of your haiku.");
            String thirdLineFromUser = inputFromUser.nextLine();
            HaikuPoem haikuPoemFromUser = new HaikuPoem(name, firstLineFromUser, secondLineFromUser, thirdLineFromUser); // creates an Haiku object.
            System.out.println(haikuPoemFromUser); // prints out the poem, author and poemID.
            checker.haikuChecker(haikuPoemFromUser); // Sends the poem into our checker, to see if it keeps the rules of Haikus.
            keepMakingPoems = anotherHaiku(); // Sends us to the method that ask if we wanna go again!
        }
    }

}
