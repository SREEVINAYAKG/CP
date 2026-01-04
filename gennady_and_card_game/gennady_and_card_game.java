import java.util.*;
public class gennady_and_card_game {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char ch1 = s.charAt(0);
    char ch2 = s.charAt(1);
    for(int i=0;i<5;i++){
        String s1 = sc.next();
        if(s1.charAt(0)==ch1 || s1.charAt(1)==ch2){
            System.out.println("YES");
            return;
        }
    }
    System.out.println("NO");
}
    
}