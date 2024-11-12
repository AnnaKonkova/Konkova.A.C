package memento;


import java.util.List;

public class Memento {
    private final List<Contact> contacts;

    public Memento(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}