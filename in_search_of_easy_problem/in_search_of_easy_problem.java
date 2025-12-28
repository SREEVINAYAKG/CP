import java.util.*;
public class in_search_of_easy_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hard = false;
        for(int i=0;i<n;i++){
            int diff = sc.nextInt();
            if(diff==1){
                hard=true;
                break;
            }
        }
        if(hard)System.out.println("HARD");
        else System.out.println("EASY");
    }
    
}