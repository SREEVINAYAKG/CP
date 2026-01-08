import java.util.*;
public class repeating_cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder result = new StringBuilder();
        Character prev = s.charAt(0);
        int cnt = 1;
        int i=0;
        while(i<n){
            result.append(s.charAt(i));
            cnt++;
            i+=cnt;
        }
        System.out.println(result.toString());
    }
}