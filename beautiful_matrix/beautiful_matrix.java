import java.util.*;
public class beautiful_matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=0,col=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int x = sc.nextInt();
                if(x==1){
                    row=i;
                    col=j;
                    break;
                }
            }
        }
        int ans = Math.abs(3-row) + Math.abs(3-col);
        System.out.println(ans);
        
    }
}
