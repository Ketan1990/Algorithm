package stack;

public class StackImplJava<A> {
    private Node first = null;
    private class Node {
        A item;
        Node next;
    }

    public boolean isEmpty() {
        return  first == null;
    }

    public void push(A a) {
        Node oldNode = first;
        first = new Node();
        first.item = a;
        first.next = oldNode;

    }

    public A pop() {
        if(isEmpty())
            return null;
        A item  = first.item;
        first = first.next;
        return item ;
    }
}
