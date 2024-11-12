package memento;

public class Main {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        Caretaker caretaker = new Caretaker();

        // Добавляем контакты
        contactList.addContact(new Contact("Alice", "123-456-7890"));
        contactList.addContact(new Contact("Bob", "987-654-3210"));

        // Сохраняем состояние
        caretaker.addMemento(contactList.save());

        // Добавляем еще один контакт
        contactList.addContact(new Contact("Charlie", "555-555-5555"));

        // Выводим текущие контакты
        System.out.println("Current Contacts: " + contactList.getContacts());

        // Восстанавливаем предыдущее состояние
        contactList.restore(caretaker.getMemento(0));

        // Выводим восстановленные контакты
        System.out.println("Restored Contacts: " + contactList.getContacts());
    }
}