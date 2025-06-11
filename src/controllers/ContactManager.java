package controllers;
import models.*;

public class ContactManager {
    private LinkedList<Contact> contacts;

    public ContactManager() {
        contacts = new LinkedList<>();
    }

    public void addContact(Contact contact) {
        contacts.appendToTail(contact);
    }

    public Contact findContactByName(String name) {
        Node<Contact> current = contacts.getHead();
        while (current != null) {
            String contactName = current.getValue().getName();
            if (contactName.equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    } 

    public boolean deleteContactByName(String name) {
        Contact contactToDelete = findContactByName(name);
        if (contactToDelete != null) {
            return contacts.deleteByValue(contactToDelete);
        }
        return false;
    }

    public void printList() {
        contacts.printLinkedList();
    }
}