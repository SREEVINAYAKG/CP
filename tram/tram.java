import java.util.*;
public class tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=0;
        int current=0;
        while(n-->0){
            int exit = sc.nextInt();
            int entry = sc.nextInt();
            current = current+(entry-exit);
            max = Math.max(max,current);
        }
        System.out.println(max);
    }
}