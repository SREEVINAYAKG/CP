import java.util.*;
public class arrival_of_general {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min_ind=-1,max_ind=-1;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                max_ind=i;
            }if(arr[i]<=min){
                min=arr[i];
                min_ind=i;
            }
        }
        int collision = 0;
        if(max_ind>min_ind){
            collision=-1;
        }
        int swaps = collision+(max_ind)+(n-1-min_ind);
        System.out.println(swaps);
        
    }
}