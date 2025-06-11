package controllers;

import views.ConsoleView;
import models.*;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController(ContactManager contactManager, ConsoleView consoleView) {
        this.contactManager = contactManager;
        this.consoleView = consoleView;
    }

    public ContactManager getContactManager() {
        return contactManager;
    }

    public void setContactManager(ContactManager contactManager) {
        this.contactManager = contactManager;
    }

    public ConsoleView getConsoleView() {
        return consoleView;
    }

    public void setConsoleView(ConsoleView consoleView) {
        this.consoleView = consoleView;
    }

    public void showMenu() {
        String option;
        do {
            consoleView.displayMenu();
            option = consoleView.getInput("Selecciona una opción: ");
            switch (option) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printList();
                    break;
                case "0":
                    consoleView.showMessage("fin");
                    break;
                default:
                    consoleView.showMessage("Opción inválida.\n");
            }
        } while (!option.equals("0"));
    }

    private void addContact() {
        consoleView.showMessage("\n- Añadir Contacto -");
        String nombre   = consoleView.getInput("Nombre: ");
        String telefono = consoleView.getInput("Teléfono: ");
        Contact c = new Contact(nombre, telefono);
        contactManager.addContact(c);
        consoleView.showMessage("\nContacto agregado.\n");
    }

    private void findContact() {
        consoleView.showMessage("\n- Buscar Contacto -");
        String nombre = consoleView.getInput("Nombre a buscar: ");
        Contact c = contactManager.findContactByName(nombre);
        if (c != null) {
            consoleView.showMessage("\nEncontrado: " + c + "\n");
        } else {
            consoleView.showMessage("\nNo existe contacto con ese nombre.\n");
        }
    }

    private void deleteContact() {
        consoleView.showMessage("\n- Eliminar Contacto -");
        String nombre = consoleView.getInput("Nombre a eliminar: ");
        boolean resul = contactManager.deleteContactByName(nombre);
        if (resul) {
            consoleView.showMessage("\nContacto eliminado.\n");
        } else {
            consoleView.showMessage("\nNo se encontró el contacto.\n");
        }
    }

    private void printList() {
        consoleView.showMessage("\n- Lista de Contactos -");
        contactManager.printList();
        consoleView.showMessage("");
    }
}
