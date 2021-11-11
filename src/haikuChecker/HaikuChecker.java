package haikuChecker;

import data.Uploader;

public class HaikuChecker {
    public char[] vowels = {'a','e','i','o','u', 'A', 'E', 'I', 'O','U'}; // char array with vowels, both capital and non-capital letters.
    Uploader uploader = new Uploader();

    public boolean vowelChecker(String line, int numberOfVowels){ // Checker method. Takes a haiku poem, and an int which is the number of syllables for each line (5 for first, 7 for second, 5 for third).
        char[] lineAsArray = line.toCharArray(); // Makes the line we put into method to a char array.
        char lastChar = ','; // Set ups a lastChar variable, used later for checking for double vowel.
        int vowelCounter = 0; // vowel counter, to check if we have 5 or 7 syllables.
        for (int i = 0; i < lineAsArray.length; i++) { // for loop, length of our char array.
            char currentChar = lineAsArray[i]; // takes the char at index i in the loop.
            for (int j = 0; j < vowels.length; j++) { // for loop, length of our "vowels" array.
                if (currentChar == vowels[j] && lastChar == currentChar){ // if currentChar is a vowel and last char is the same as currentChar, it means there's a vowel repeating (ee, aa, for instance) and therefore we take our counter 1 down.
                    vowelCounter --;
                }
                if (currentChar == vowels[j]){ // if currentChar is a vowel, our counter goes 1 up. This is nullified by the line 2 above. - and + goes even, so counter stays the same.
                    vowelCounter ++;
                }
            }
        lastChar = currentChar; // Makes our lastChar to the currentChar before assigning a new char to currentChar.
        }
        if (vowelCounter == numberOfVowels){ // if the vowelcounter is equal to the int we gave when we called the method, it returns true (5 syllables for instance).
            return true;
        } else {
            return false; // if it's not, there's not 5 or 7 syllables in the line and it's not truuuue.
        }
    }

    public void haikuChecker(HaikuPoem currentHaiku){ // Takes a haiku poem and checks it for syllables.
        String author = currentHaiku.getAuthor();
        int id = currentHaiku.getHaikuID();
        String firstLine = currentHaiku.getFirstLine(); // Creates firstLine from the getter.
        String secondLine = currentHaiku.getSecondLine(); // -||- for secondLine
        String thirdLine = currentHaiku.getThirdLine(); // -||- for thirdLine.

        if (vowelChecker(firstLine,5) && vowelChecker(secondLine,7) && vowelChecker(thirdLine, 5)){ // Puts our 3 lines into our checker method. Could skip the steps above (getters) and just put them directly into the method.
            System.out.println("Poem is haiku."); // If the method is true, it'll say your poem is a haiku.
            System.out.println(currentHaiku);
            uploader.uploadToFile(author,id,firstLine,secondLine,thirdLine);

        }else {
            System.out.println("Your poem ain't a haiku bruh!"); // if the poem fails the checker, it'll print that it ain't a poem.
        }

    }



}
