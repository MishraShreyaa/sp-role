
import java.util.*;

public class LongestCommonPrefix {

    public static String solve(String[] A) {

        String prefix = A[0];

        for (int i = 1; i < A.length; i++) {

            while (!A[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] S = new String[n];

        for (int i = 0; i < n; i++) {
            S[i] = sc.next();
        }

        String result = solve(S);

        System.out.println(result);

        sc.close();
    }
}
