import java.util.*;

public class ReverseString {
    public static String solve(String A) {
        char[] arr = A.toCharArray();

        int p = 0;
        int q = arr.length - 1;

        while (p < q) {

            char temp = arr[p];

            arr[p] = arr[q];
            arr[q] = temp;

            p++;
            q--;
        }
        return new String(arr);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        String result = solve(A);
        System.out.println(result);
        sc.close();
    }
}
// using Stringbuilder

/*
 * public static String solveString(String A) {
 * 
 * StringBuilder sb = new StringBuilder(A);
 * 
 * sb.reverse();
 * 
 * return sb.toString();
 */

// using concatenation
/*
 * String result="";
 * for(int i=A.length()-1; i>=0; i--){
 * result= result + A.charAt(i);
 * 
 * }
 * return result;
 */