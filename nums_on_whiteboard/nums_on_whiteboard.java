import java.util.*;
public class nums_on_whiteboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        ArrayList<Integer> result = new ArrayList<>();
        while(nums.size() > 1) {
            int size = nums.size();
            int sum = nums.get(size-1)+nums.get(size-2);
            result.add(nums.get(size-1));
            result.add(nums.get(size-2));
            nums.remove(size-1);
            nums.remove(size-2);
            if(sum%2==0){
                nums.add(sum/2);
            }else{
                nums.add(sum/2+1);
            }
        }
        System.out.println(nums.get(nums.size()-1));
        for(int i=0;i<result.size();i+=2){
            System.out.print(result.get(i)+ " "+result.get(i+1));
            System.out.println();
        }
    }
    }
    
}