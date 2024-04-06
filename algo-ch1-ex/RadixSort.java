public class RadixSort {
    public static void sort(int[] A) {
        int i, m = A[0], exp = 1, N = A.length;
        int[] B = new int[N];
        
        for(i = 1; i < N; i++)
            if (A[i] > m) m = A[i];

        while(m / exp > 0) {
            int[] C = new int[10];
            for(i = 0; i < N; i++) C[(A[i] / exp) % 10]++;
            for(i = 1; i < 10; i++) C[i] += C[i - 1];
            for(i = N - 1; i >= 0; i--) B[--C[(A[i] / exp) % 10]] = A[i];
            for(i = 0; i < N; i++)
                A[i] = B[i];
            exp *= 10;
        }
    }

    public static void main(String[] args) {
        int[] A = {10, 4, 5, 8, 1, 3, 6};
        RadixSort.sort(A);

        for(int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
    }
}
