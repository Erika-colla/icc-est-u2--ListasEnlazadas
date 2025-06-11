import controllers.ContactManager;
import controllers.MenuController;
import models.Contact;
import views.ConsoleView;

public class App {
    public static void main(String[] args) {
        ConsoleView consoleView = new ConsoleView();
        ContactManager contactManager = new ContactManager();

        contactManager.addContact(new Contact("Juan Perez", "0987654321"));
        contactManager.addContact(new Contact("Maria Lopez", "0991122334"));
        contactManager.addContact(new Contact("Carlos Torres", "0977889900"));
        contactManager.addContact(new Contact("Lucia Gomez", "0966543210"));

        MenuController menuController = new MenuController(contactManager, consoleView);

        menuController.showMenu();
        consoleView.closeScanner();
    }
}