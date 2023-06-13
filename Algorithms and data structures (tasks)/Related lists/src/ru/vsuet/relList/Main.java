package ru.vsuet.rellist;

public class Main {
    public static void main(String[] args)
    {
        IList list = new LList();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(13);
        System.out.println(list);
        list.add(1, 2);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}