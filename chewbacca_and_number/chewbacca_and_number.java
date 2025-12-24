import java.util.*;
public class chewbacca_and_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        for(int i=0;i<arr.length;i++){
            if(i==0 && arr[i]=='9') continue;
            int digit = arr[i]-'0';
            arr[i] = (char)(Math.min(digit,9-digit)+'0');
        }
        System.out.println(new String(arr));
        sc.close();
    }
}