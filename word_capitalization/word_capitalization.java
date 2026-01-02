import java.util.*;
public class word_capitalization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char firstChar = str.charAt(0);
        if(Character.isLowerCase(firstChar)){
            firstChar = Character.toUpperCase(firstChar);
        }
        StringBuilder result = new StringBuilder(str);
        result.setCharAt(0, firstChar);
        System.out.println(result.toString());
    }
    
}