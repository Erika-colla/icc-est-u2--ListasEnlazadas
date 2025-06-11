package views;

import java.util.Scanner; 

public class ConsoleView {

    private Scanner scanner; 

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("====== GESTIÓN DE CONTACTOS ======");
        System.out.println("1. Añadir Contacto");
        System.out.println("2. Buscar Contacto");
        System.out.println("3. Eliminar Contacto");
        System.out.println("4. Mostrar Todos los Contactos");
        System.out.println("0. Salir");
        System.out.println("==================================");
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}