import java.util.*;
public class string_task {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(Character.toLowerCase((s.charAt(i)))=='a' || Character.toLowerCase((s.charAt(i)))=='e' || Character.toLowerCase((s.charAt(i)))=='i' || Character.toLowerCase((s.charAt(i)))=='o' || Character.toLowerCase((s.charAt(i)))=='u' || Character.toLowerCase((s.charAt(i)))=='y'){
                continue;
            }
            else{
                sb.append(Character.toLowerCase(s.charAt(i)));
                sb.append('.');
            }
        }
        sb.reverse();
        System.out.println(sb.toString());
    }    
}