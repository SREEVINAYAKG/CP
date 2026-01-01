import java.util.Scanner;
public class boy_or_girl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long count = s.chars().distinct().count();
        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }    
    }

    
}