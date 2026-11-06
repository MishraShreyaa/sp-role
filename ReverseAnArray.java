import java.util.*;

public class ReverseAnArray {
    public static int[] solve(int[] A) {
        int p = 0; // pointer1
        int q = A.length - 1; // pointer2
        while (p < q) {
            int temp = A[p];
            A[p] = A[q];
            A[q] = temp;
            q--;
            p++;

        }
        return A;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();

        }
        int[] result = solve(A);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }

}
