package haikuChecker;

import ui.Menu;

public class HaikuChecker {
    public char[] vowels = {'a','e','i','o','u', 'A', 'E', 'I', 'O','U'};


    public boolean vowelChecker5(String line){
        char[] lineAsArray = line.toCharArray();
        int vowelCounter = 0;
        for (int i = 0; i < lineAsArray.length; i++) {
            char c = lineAsArray[i];
            for (int j = 0; j < vowels.length; j++) {
                if (c == vowels[j]){
                    vowelCounter ++;
                }
            }
        }
        if (vowelCounter == 5){
            return true;
        } else {
            return false;
        }
    }

    public boolean vowelChecker7(String line){
        char[] lineAsArray = line.toCharArray();
        int vowelCounter = 0;
        for (int i = 0; i < lineAsArray.length; i++) {
            char c = lineAsArray[i];
            for (int j = 0; j < vowels.length; j++) {
                if (c == vowels[j]){
                    vowelCounter ++;
                }
            }
        }
        if(vowelCounter == 7){
            return true;
        } else{
            return false;
        }
    }

    public void vowelChecker(HaikuPoem current){
        String firstLine = current.getFirstLine();
        //vowelChecker5(firstLine);
        String secondLine = current.getSecondLine();
        //vowelChecker7(secondLine);
        String thirdLine = current.getThirdLine();
        //vowelChecker5(thirdLine);

        if (vowelChecker5(firstLine) && vowelChecker7(secondLine) && vowelChecker5(thirdLine)){
            System.out.println(current);
            System.out.println("Your poem is a haiku!");
        }else {
            System.out.println("Your poem ain't a haiku bruh!");
        }

    }



}
