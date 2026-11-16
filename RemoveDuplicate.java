import java.util.*;

public class RemoveDuplicate {
    public static void solve(String A){
    LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();
    for(int i=0; i<A.length(); i++){
        char ch= A.charAt(i);
        map.put(ch, map.getOrDefault(ch,0)+1);

    }
    for(char ch:map.keySet()){
        System.out.print(ch);

    }}

 public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    String A= sc.nextLine();
    solve(A);
    sc.close();
 }
}
