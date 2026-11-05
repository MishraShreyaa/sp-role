import java.util.*;

public class secondLargest {
    public static int solve  (int[] A) {
     int L= Integer.MIN_VALUE; // largest
    int  SL=Integer.MIN_VALUE; // SecondLargest
     for(int i=0; i<A.length; i++){
        if( L < A[i] )
        {
            SL= L;
            L=A[i];

        }
        else if ( A[i] < L && SL< A[i]){
            SL= A[i];
        }

     }
      if ( SL== Integer.MIN_VALUE){
        return -1;

      }
       return SL;



    }
     public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int A[]= new int[n];

        for ( int i=0; i<A.length; i++){
            A[i]=sc.nextInt();
            


        }
         int result = solve(A);
             System.out.println(result);
             
         sc.close();
     }

}
