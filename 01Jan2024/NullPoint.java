import java.util.*;
public class NullPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a[] = null;
        try {
        for(int i=0; i<a.length; i++)
            System.out.println(a[i]);
        } catch (Exception e) {
           System.out.println("error due to: "+e);
        }
        sc.close();
    }
}
