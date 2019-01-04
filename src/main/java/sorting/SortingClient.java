package sorting;

public class SortingClient {
    public static void main(String[] args) {
        String[] data = "A B C D E F G H I J Y Z K L M N O P Q R V W X S T U ".split(" ");
        long start = System.nanoTime();

        Shuffle.sort(data);

        long end = System.nanoTime();

        System.out.println("time:-"+ (end - start));

        for (String word : data) {
            System.out.print(word+ " ");
        }
    }
}