package ru.vsuet.relList;

import java.util.function.Predicate;
public class Main {
    public static void main(String[] args)
    {
        LList list = new LList();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
    }
}