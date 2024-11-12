package memento;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private List<Contact> contacts;

    public ContactList() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public List<Contact> getContacts() {
        return new ArrayList<>(contacts); // Возвращаем копию списка
    }

    public Memento save() {
        return new Memento(new ArrayList<>(contacts)); // Сохраняем текущее состояние
    }

    public void restore(Memento memento) {
        this.contacts = memento.getContacts(); // Восстанавливаем состояние
    }
}