package queue;

public class QueueImpljava<Item> {

    private Node first ,last;

    private class Node {
        Item item;
        Node next;

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
