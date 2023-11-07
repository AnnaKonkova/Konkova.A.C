package ru.vsuet.rellist;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LList implements IList  {
    private Node head;
    private int size =1;

    public class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public void add(int value) { // добавляем в конец
        Node newNode = new Node(value);
        Node currentNode = head;

        if(head==null){
            head = newNode;
        }else{
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }
    @Override
    public void add(int idx, int value) {
        if (idx < 0 && idx >= size) {
            throw new IndexOutOfBoundsException("Элемента нет:");
        }
        Node newNode = new Node(value);
        if (idx == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < idx - 1; i++) {
                if (current == null) {
                    throw new IndexOutOfBoundsException("Индекс выходит за пределы");
                }
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }
    @Override
    public void remove(int idx) {
        if (idx < 0 && idx >= size) {
            throw new IndexOutOfBoundsException("Элемента нет:");
        }
        if (idx == 0) {
            head = head.next;
        } else {
            Node previousNode = head;
            for (int i = 0; i < idx - 1; i++) {
                previousNode = previousNode.next;
            }
            previousNode.next = previousNode.next.next;
        }
        size--;
    }
    @Override
    public void remove(Predicate<Integer> predicate) {
        if (head == null) {
            return;
        }

        Node currentNode = head;
        Node previousNode = null;

        while (currentNode != null) {
            if (predicate.test(currentNode.value)) {
                if (previousNode == null) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
            } else {
                previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        size--;
    }

    @Override
    public int get(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Элемента нет:");
        }
        Node currentNode = head;
        for (int i = 0; i < idx; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }


    @Override
    public String toString() {
        int[] values = new int[size];
        int i = 0;
        Node current = head;
        while(current != null) {
            values[i] = current.value;
            current = current.next;
            i++;
        }
        return Arrays.stream(values)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }

}
