package sorting;

public class ShellSort extends Sorting {

    public static void sort(Comparable[] data){
        final int N  = data.length;
        int h =1;
        while(h < N / 3)
            h = 3 * h +1;

        while(h >=1) {
            for (int i = 0; i < N; i++) {
                for (int j = i; j >= h  && less(data[j],data[j-h]); j =- h) {
                    exch(data,j,j-h);
                }
            }
            h = h /3;
        }

    }
}
