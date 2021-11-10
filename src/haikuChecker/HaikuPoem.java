package haikuChecker;

public class HaikuPoem {
    private String author;
    private int haikuID;
    private String firstLine;
    private String secondLine;
    private String thirdLine;

    private static int haikuCounter = 0;

    public HaikuPoem (String author, String firstLine, String secondLine, String thirdLine){
        this.author = author;
        haikuCounter ++;
        haikuID = haikuCounter;
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
    }

    public String getFirstLine(){
        return firstLine;
    }
    public String getSecondLine(){
        return secondLine;
    }
    public String getThirdLine(){
        return thirdLine;
    }



    public String toString (){
        return "Haiku poem written by; "+author+" with haiku ID number; "+haikuID+"\n"+firstLine+"\n"+secondLine+"\n"+thirdLine;
    }
}
