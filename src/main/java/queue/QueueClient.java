package queue;

public class QueueClient {
    public static void main(String[] args) {
        QueueImpljava<String> q = new QueueImpljava<String>();
        q.enque ("a");
        q.enque ("b");
        q.enque ("c");
        q.enque ("s");
        System.out.println (q.dequeue());
    }
}
