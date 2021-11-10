import haikuChecker.HaikuChecker;
import haikuChecker.HaikuPoem;
import ui.Menu;

public class HaikuApp {

    private Menu menu = new Menu();
    private HaikuChecker checker = new HaikuChecker();

    public static void main(String[] args) {
     HaikuApp app = new HaikuApp();
     HaikuPoem testPoem = new HaikuPoem("Mikkel", "sitting on a rock","i watch the tall grass blow slow", "and birds faintly sing");
     app.menu.welcomeToApp();
     //app.menu.typeInHaikuPoem();
     // System.out.println(testPoem);
     app.checker.vowelChecker(testPoem);
     //app.menu.typeInHaikuPoem();
    }

}
