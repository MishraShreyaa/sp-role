import java.util.*;
public class RemoveDuplicates {
    public static int solve( int [] A){
        int count= 0;
        for(int i=1 ; i<A.length; i++){
             if (A[i] != A[i-1]) {
              A[count] = A[i];
              count++;
}
                
        }
        return count;

    }
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int A[] = new int[n];
        for(int i=0; i<A.length; i++){
            A[i]= sc.nextInt();

        }
        int result= solve(A);
        System.out.println(result);

    }
}
