import java.util.*;
public class Smallest{
    public static int solve(int[]A){
        int smallest=A[0];
        for(int i=1; i<A.length; i++){
            if(A[i]< smallest){
             smallest= A[i];
            }
        }
        return smallest;

    }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int A[]= new int[n];
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();

        }
        int result= solve(A);
        System.out.println(result);
        sc.close();


    }
}