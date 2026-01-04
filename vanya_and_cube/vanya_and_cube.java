import java.util.*;
public class vanya_and_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int currCount = 0;
        while(n>=0){
            currCount++;
            count+=currCount;
            n-=count;
        }
        System.out.println(currCount-1);
    }
    
}