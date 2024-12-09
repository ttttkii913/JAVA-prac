import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = ""; 
        
        for(int i = 0; i < a.length(); i++) {
            char str = a.charAt(i);
            if(Character.isLowerCase(str)) {
                b += Character.toUpperCase(str);
            } else {
                b += Character.toLowerCase(str);
            }
        }
        System.out.print(b);
    }
}