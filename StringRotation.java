import java.util.*;
public class StringRotation {
    public static Boolean solve(String A, String B){
    String C= A.concat(A);

    if (A.length() != B.length()) {
    return false;
      }
    if(C.contains(B)){
         return true;
    } 
    return false;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        String A=sc.nextLine();
        String B= sc.nextLine();
        boolean result= solve(A , B);
        System.out.print(result);
        sc.close();
    }
}
