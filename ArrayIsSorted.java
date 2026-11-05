import java.util.*;

public class ArrayIsSorted {
    public static int solve(int[]A){
     for(int i=1; i<A.length; i++){
        if(A[i] < A[i-1]){
            return 0;

        }
       
     }
      return 1;
    

     }
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int A[]= new int[n];
        for(int i=0; i<n; i++){
            A[i]= sc.nextInt();

        }
        int result= solve(A);
        System.out.println(result);
        sc.close();
     }
}
