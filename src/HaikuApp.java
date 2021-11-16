import haikuChecker.HaikuChecker;
import haikuChecker.HaikuPoem;
import ui.Menu;

public class HaikuApp {

    private Menu menu = new Menu();
    private HaikuChecker checker = new HaikuChecker();

    public static void main(String[] args) {
     HaikuApp app = new HaikuApp();
     HaikuPoem testPoem = new HaikuPoem("Mikkel", "sitting on a rock","i watch the tall grass blow slow", "and birds faintly sing");
     HaikuPoem testPoem1 = new HaikuPoem("Mads","swirling and twirling","sloshing, splasing and crashing","all wrinkling with fish");
     app.menu.welcomeToApp();
     //app.menu.typeInHaikuPoem(); // Method that'll allow the user to type in their own poem, and it'll then get checked and verified.
     app.checker.haikuChecker(testPoem); // Testers
     app.checker.haikuChecker(testPoem1); // Testers
    }

}
