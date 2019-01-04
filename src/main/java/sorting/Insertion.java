package sorting;

import java.util.Comparator;

public class Insertion extends Sorting {

     public static void sort(Comparable[] data) {
        final int SIZE  = data.length;
        for (int i = 0; i < SIZE; i++) {

            for (int j = i; j > 0 ; j--) {
                if(less(data[j],data[j-1])) {
                   exch(data,j,j-1);
                }else{
                    break;
                }
            }
        }
    }


}
