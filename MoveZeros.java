import java.util.*;
public class MoveZeros {
    public static int [] solve(int [] A){
        int p=0;
        for(int i=0; i<A.length; i++){
            if(A[i]!=0){
              A[p]= A[i];
              p++;
            }

        }
       
        for(int j=p ; j<A.length;j++ ){

         A[j]= 0;

        }
         return A;

    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []A= new int[n];
        for(int i=0; i< A.length; i++){
            A[i]= sc.nextInt();
        }
        int [] result = solve(A);
        for(int j=0; j<n; j++){
            System.out.print(result[j] + " ");
        }
    }
    
}
