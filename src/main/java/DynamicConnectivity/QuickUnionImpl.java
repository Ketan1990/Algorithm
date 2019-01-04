package DynamicConnectivity;

public class QuickUnionImpl {
    private int[] id;
    private int[] sz;

    public QuickUnionImpl(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    public boolean connected(int p , int q){
        return root(p) == root(q);
    }

    private int root(int i) {
        while(i != id[i]) {
            i = id[i];
        }

        return i;
    }

    public void union(int p,int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if  (sz[i] < sz[j]) {
            id[i] = j; sz[j] += sz[i];
        }
        else{
            id[j] = i; sz[i] += sz[j];
        }
    }


    public static void main(String[] args) {
        QuickUnionImpl q =new QuickUnionImpl(50);
        q.union(0,1);
        q.union(3,2);
        q.union(2,3);
        q.union(10,4);
        q.union(13,5);
        q.union(12,6);
        q.union(10,7);
        q.union(13,8);
        q.union(10,9);
        q.union(31,10);
        q.union(21,11);
        q.union(41,12);
        q.union(13,13);
        q.union(22,14);
        q.union(40,15);
        q.union(43,16);
        q.union(32,17);
        q.union(30,18);
        q.union(2,19);
        q.union(10,20);
        q.union(13,21);
        q.union(12,22);
        q.union(10,23);
        q.union(13,24);
        q.union(0,25);
        q.union(3,26);
        q.union(2,27);
        q.union(10,28);
        q.union(13,29);
        q.union(12,30);
        q.union(0,31);
        q.union(3,32);
        q.union(2,33);
        q.union(10,34);
        q.union(13,35);
        q.union(12,36);
        q.union(10,37);
        q.union(13,38);
        q.union(10,39);
        q.union(31,40);
        q.union(0,41);
        q.union(3,42);
        q.union(2,43);
        q.union(10,44);
        q.union(13,45);
        q.union(12,46);
        q.union(10,47);
        q.union(13,48);
        q.union(10,49);


        long start = System.currentTimeMillis();

        System.out.println(""+q.connected(4,7));
        long end = System.currentTimeMillis();
        System.out.println(end - start );
    }
}
