import java.util.*;
public class ArithmeticApp {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter Numbers a, b");
        Scanner sc = new Scanner (System.in);
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            c = a/b;
            System.out.println("Output: "+c);
        } catch (Exception e) {
            System.out.println("Error due to: "+e);
        }
        sc.close();
    }
}