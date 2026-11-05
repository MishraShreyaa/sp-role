import java.util.*;

public class secondLargest {
    public static int solve  (int[] A) {
     int Largest= Integer.MIN_VALUE; // largest
    int  secondLargest=Integer.MIN_VALUE; // SecondLargest
     for(int i=0; i<A.length; i++){
        if( Largest < A[i] )
        {
            secondLargest= Largest;
            Largest=A[i];

        }
        else if ( A[i] < Largest && secondLargest< A[i]){
            secondLargest= A[i];
        }

     }
      if ( secondLargest== Integer.MIN_VALUE){
        return -1;

      }
       return secondLargest;



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
