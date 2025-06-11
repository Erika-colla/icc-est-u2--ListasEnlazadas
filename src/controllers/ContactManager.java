package controllers;

import models.Contact;
import models.LinkedList;

public class ContactManager {
    private LinkedList<Contact<String, String>> contacts = new LinkedList<>();

    public void addContact(Contact<String, String> contact) {
        contacts.appendToTail(contact);
    }

    public void printList() {
        contacts.printLinkedList();
    }

    public boolean deleteContactByName(String name) {
        Contact<String, String> dummyContact = new Contact<>(name, ""); 
        return contacts.deleteByValue(dummyContact);
    }

    public Contact<String, String> findContactByName(String name) {
        Contact<String, String> dummyContact = new Contact<>(name, ""); 
        return contacts.findByValue(dummyContact);
    }
}