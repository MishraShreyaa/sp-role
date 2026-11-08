import java.util.*;
public class PalindromeString {
    public static String solve(String A){
       char[] arr= A.toCharArray();
       int p =0;
       int q= arr.length-1;
       while (p<q){
        char temp = arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        p++;
        q--;
       }
      String  result = new String(arr);
      if(result.equals(A)){
        return "Palindrome";
      }
      else{
        return "Not Palindrome";
      }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String A= sc.nextLine();
        String result = solve(A);
        System.out.println(result);
    }
    
}
