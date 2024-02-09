import java.util.*;
public class InputMis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a;
            a = sc.nextInt();
            System.out.println(a);
        } catch (Exception e) {
           System.out.println("Error due to: "+e);
        }
        sc.close();
    }
}
