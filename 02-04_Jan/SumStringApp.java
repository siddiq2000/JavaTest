import java.util.*;
public class SumStringApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum = 0;
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++){
            sum += c[i] - 48;
        }
        System.out.println("Sum of all Digits in String is "+sum);
        sc.close();
    }
}