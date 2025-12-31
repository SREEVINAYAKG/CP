import java.util.*;
public class soldier_and_bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int total = sc.nextInt();
        int bananas = sc.nextInt();
        int cost = 0;
        for(int i=1; i<=bananas; i++){
            cost += i*k;
        }
        if(cost>total){
            System.out.println(cost - total);
        }else{
            System.out.println(0);
        }
    }
    
}