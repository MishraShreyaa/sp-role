
import java.util.*;

public class LongestSubstring {
    public static int solve(String S) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < S.length(); right++) {
            char ch = S.charAt(right);
while (set.contains(ch)) {
                set.remove(S.charAt(left));
                left++;
            }set.add(ch);
            maxLength = Math.max(maxLength, right - left + 1);
        }
return maxLength;
    }public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
String S = sc.nextLine();
int result = solve(S);
System.out.println(result);

sc.close();
    }
}
