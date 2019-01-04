package sorting;

public  abstract class Sorting {

    public static  boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0 ;
    }

    public static  void exch(Comparable[] a, int i, int j)   {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
