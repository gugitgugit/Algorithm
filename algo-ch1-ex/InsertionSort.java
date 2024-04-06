public class InsertionSort extends AbstractSort{
    public static void sort(Comparable[] a) {
        int N = a.length;
        for(int i = 1; i < N; i++) 
            for(int j = i; j > 0 && less(a[j], a[j - 1]); j--)
                exch(a, j, j - 1);

    }

    public static void main(String[] args) {
        Integer[] a = {5, 7, 8, 2, 3};
        InsertionSort.sort(a);
        InsertionSort.show(a);
    }
}