import java.util.*;

public class CountVowelsConsonants {
    public static int[] solve(String A) {
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (Character.isLetter(ch)) {
                ch= Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }

        }
        return new int[] { vowel, consonant };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();

        int result[] = solve(A);
        System.out.println(result[0]);
        System.out.println(result[1]);
        sc.close();

    }
}
