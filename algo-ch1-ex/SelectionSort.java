public class SelectionSort extends AbstractSort {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for(int i = 0; i < N - 1; i++) {
            int min = i;
            for(int j = i + 1; j < N; j++) {
                if(less(a[j], a[min]))
                    min = j;
            }
            exch(a, i, min);
        }
        assert isSorted(a);
    }

    public static void main(String[] args) {
        Integer[] a = {5, 7, 8, 2, 3};
        SelectionSort.sort(a);
        SelectionSort.show(a);
    }
} 