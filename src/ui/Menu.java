package ui;

import haikuChecker.HaikuChecker;
import haikuChecker.HaikuPoem;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner inputFromUser;
    public ArrayList<HaikuPoem> listOfPoems = new ArrayList<>();
    private HaikuPoem currentPoem = null;
    private HaikuChecker checker = new HaikuChecker();

    public Menu(){
        this.inputFromUser = new Scanner(System.in);
    }

    public void welcomeToApp(){
        System.out.println("Welcome to the haiku-app!");
    }

    public void typeInHaikuPoem(){
        System.out.println("Type in your name.");
        String name = inputFromUser.nextLine();
        System.out.println("Type in the first line of your haiku.");
        String firstLineFromUser = inputFromUser.nextLine();
        System.out.println("Type in the second line of your haiku.");
        String secondLineFromUser = inputFromUser.nextLine();
        System.out.println("Type in the third line of your haiku.");
        String thirdLineFromUser = inputFromUser.nextLine();
        HaikuPoem haikuPoemFromUser = new HaikuPoem(name,firstLineFromUser,secondLineFromUser,thirdLineFromUser);
        System.out.println(haikuPoemFromUser);
        //listOfPoems.add(haikuPoemFromUser);
        checker.vowelChecker(haikuPoemFromUser);

    }

}
