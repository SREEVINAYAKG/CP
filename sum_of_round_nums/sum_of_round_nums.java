import java.util.*;
public class sum_of_round_nums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            String str = Integer.toString(n);
            int len = str.length();
            for(int i=0;i<len;i++){
                if(str.charAt(i)!='0'){
                    int remDigits = len-i-1;
                    int roundNum = (int)(str.charAt(i)-'0')*(int)Math.pow(10,remDigits);
                    arr.add(roundNum);
                }
            }
            System.out.println(arr.size());
            for(int num:arr){
                System.out.print(num+" ");
            }
            t--;
            System.out.println();
        }

        
    }
}
