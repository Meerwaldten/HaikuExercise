package haikuChecker;

public class HaikuPoem {
    private String author;
    private int haikuID;
    private String firstLine;
    private String secondLine;
    private String thirdLine;

    private static int haikuCounter = 0; // Set to static so it'll keep going up and not just stay at 1 or 0.

    public HaikuPoem (String author, String firstLine, String secondLine, String thirdLine){ // Construktor for our haiku poems.
        this.author = author;
        haikuCounter ++; // Ups the haiku Counter so our haikuID changes everytime we make a new poem.
        haikuID = haikuCounter;
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
    }

    public String getAuthor(){
        return author;
    }
    public int getHaikuID(){
        return haikuID;
    }
    public String getFirstLine(){
        return firstLine;
    } // Getters for each line, used in the checker class.
    public String getSecondLine(){
        return secondLine;
    }
    public String getThirdLine(){
        return thirdLine;
    }



    public String toString (){ // To string method, so we can print our poems.
        return "Haiku poem written by; "+author+" with haiku ID number; "+haikuID+"\n"+firstLine+"\n"+secondLine+"\n"+thirdLine;
    }
}
