package ru.vsuet.annotations;
import ru.vsuet.annotations.JsonSerializer;
import ru.vsuet.annotations.Person;
public class Main {
    /**
     *
     * "name":"ivan"
     *
     */
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("Hi");

        Person person =new Person("Iavn",20,"Voronezh");

        JsonSerializer serializer = new JsonSerializer();
        System.out.println(serializer.serialize(person));
    }
}