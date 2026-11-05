import java.util.*;
public class secondSmallest {
    public static int solve(int[]A){
       int Smallest= Integer.MAX_VALUE;
       int secondSmallest=Integer.MAX_VALUE;
       for(int i=0; i<A.length; i++){
        if( A[i]< Smallest){
            secondSmallest= Smallest;
            Smallest = A[i];
            

        }
        else if( Smallest < A[i] && A[i]<secondSmallest){
            secondSmallest =  A[i];

        }
        
       }
       if(secondSmallest== Integer.MAX_VALUE){
            return -1;
        }
       return secondSmallest;
    }
    public static void main(String [] arg){
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int A[] = new int[n];
        for(int i=0; i<n; i++){
            A[i]= sc.nextInt();
        
        }
        int result = solve(A);
        System.out.println(result);
        sc.close();

    }
}
