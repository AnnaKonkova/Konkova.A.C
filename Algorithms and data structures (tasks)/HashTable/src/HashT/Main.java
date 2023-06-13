package HashT;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        HashTable<String, String> hashTable = new HashTable<>();// объект класса


        hashTable.put("Чистый код", "Роберт Мартин");
        hashTable.put("Грокаем алагоритмы", "Адитья Бхаргава");
        hashTable.put("Чистая архитектура", "Роберт Мартин");
        hashTable.put("С#", "Джеффри Рихтер");
        hashTable.put("Паттерны", "Гамма");



        String val1 = hashTable.get("Чистый код");
        System.out.println("Значение первого ключа: " + val1);
        String val4 = hashTable.get("С#");
        System.out.println("Значение четвертого ключа: " + val4);

        String val3 = hashTable.get("Чистая архитектура");
        System.out.println("Значение третьего ключа: " + val3);


        boolean removed = hashTable.remove("Грокаем алагоритмы");
        System.out.println("Удаление второго ключа: " + removed);


        try {
            String val2 = hashTable.get("Грокаем алагоритмы");
            System.out.println("Значение второго ключа: " + val2);
        } catch (NoSuchElementException Exception) {
            System.out.println(Exception.getMessage());
        }
    }
}