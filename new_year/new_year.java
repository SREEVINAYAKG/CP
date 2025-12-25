import java.util.*;

public class new_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();

        int a1=Math.abs(x2-x1);
        int a2=Math.abs(x3-x2);
        int t1=a1+a2;
        int b1=Math.abs(x2-x1);
        int b2=Math.abs(x3-x1);
        int t2=b1+b2;
        int c1=Math.abs(x2-x3);
        int c2=Math.abs(x3-x1);
        int t3=c1+c2;

        int ans=Math.min(t1,Math.min(t2,t3));
        System.out.println(ans);
    }
}
