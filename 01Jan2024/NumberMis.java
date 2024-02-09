import java.util.*;
public class NumberMis {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number ");
        String a;
        a = sc.nextLine();
        try {
            Integer.parseInt(a);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Error due to: "+e);
        }
        sc.close();
    }
}
