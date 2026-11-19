import java.util.*;

public class RemoveSpaces {

    public static String solve(String A){
        
      StringBuilder sb = new StringBuilder();
        for(int i=0; i<A.length(); i++){
            if (A.charAt(i) != ' '){
                 sb.append(A.charAt(i));
            }
               }
               String result= sb.toString();
            return result ;
        }
            public static void main(String args[]) {
           Scanner sc = new Scanner(System.in);
           String A = sc.nextLine();
           String result = solve(A);
            System.out.println(result);

            sc.close();
    }

}







