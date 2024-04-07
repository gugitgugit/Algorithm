public class CountingSort {
    public static int[] sort(int[] A, int K) {
        int i, N = A.length;
        int[] C = new int[K], B = new int[N];

        for (i = 0; i < N; i++)         C[A[i]]++;
        for (i = 1; i < K; i++)         C[i] += C[i - 1];
        for (i = N - 1; i >= 0; i--)    B[--C[A[i]]] = A[i];
        return B;
    }

    public static void main(String[] args) {
        int[] A = {10, 4, 5, 8, 1, 3, 6}, B;
        B = CountingSort.sort(A, 11);

        for(int i = 0; i < B.length; i++)
            System.out.print(B[i] + " ");
    }
}
