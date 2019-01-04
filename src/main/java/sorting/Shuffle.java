package sorting;

import java.util.Random;

public class Shuffle extends Sorting{
    static Random r = new Random();
    public static void sort(Comparable[] data){
        final int N  = data.length;
        for (int i = 0; i < N; i++) {
            int rnd = r.nextInt(N);
            exch(data,rnd,i);
        }

    }
}
