import java.util.*;

public class MaximumFrequencyCharacter {
    public static char solve(String A) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char result = '\0';
        int max = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (max < entry.getValue() ) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        System.out.println(solve(A));
        sc.close();
    }
}