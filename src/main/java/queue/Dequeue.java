package queue;

import java.util.Iterator;
import java.util.ListIterator;

public class Dequeue<Item> implements Iterable<Item>{
    private Node first ,last;

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public Object previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(Object o) {

            }

            @Override
            public void add(Object o) {

            }
        };
    }

    private class Node {
        Node prev;
        Item item;
        Node next;

    }

    public void addFirst() {

    }

    public void addLast() {

    }


    public void removeLast() {

    }
    public void removeFirs() {

    }

    public void enque(Item item) {
        Node oldnode = last;
        last = new Node();
        last.item = item;
        if(isEmpty())
            first = last;
        else
            oldnode.next = last;

    }

    private boolean isEmpty() {
        return first == null;
    }

    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if(isEmpty())
            first = null;
        else
            first.next = last;

        return item;
    }
}
