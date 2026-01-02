import java.util.*;
public class c_plus_equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int cnt = 0;
            while(b<=n && a<=n){
                if(b<a){
                    b+=a;
                    cnt++;
                }
                else{
                    a+=b;
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}