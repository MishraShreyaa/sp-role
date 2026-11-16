
import java.util.*;

public class NonRepeatingCharacter{

    public static void solve(String A) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        // Step 1: Count frequency of each character
        for (int i = 0; i < A.length(); i++) {

            char ch = A.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find the first non-repeating character
        boolean found = false;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {

                System.out.println(entry.getKey());
                found = true;
                break;
            }}
                    if (!found) {
            System.out.println("#");
        }

        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();

        solve(A);

        sc.close();
    }
}
