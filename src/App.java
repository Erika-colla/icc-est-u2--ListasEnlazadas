import controllers.ContactManager;
import controllers.MenuController;
import views.ConsoleView;

public class App {
    public static void main(String[] args) {
        ConsoleView consoleView = new ConsoleView();
        ContactManager contactManager = new ContactManager();
        MenuController menuController = new MenuController(contactManager, consoleView);

        menuController.showMenu();
        consoleView.closeScanner();
    }
}