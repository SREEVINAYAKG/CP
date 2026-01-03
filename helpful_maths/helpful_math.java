import java.util.*;
public class helpful_math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length()==1){
            System.out.println(s);
            return;
        }
        int cn1=0,cnt2=0,cn3=0;
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i)=='1') cn1++;
            else if(s.charAt(i)=='2') cnt2++;
            else cn3++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<cn1;i++){
            sb.append("1+");
        }
        for(int i=0;i<cnt2;i++){
            sb.append("2+");
        }
        for(int i=0;i<cn3;i++){
            sb.append("3+");
        }
        System.out.println(sb.substring(0,sb.length()-1));
        
    }
    
}