import java.util.*;
public class ArrayOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a[] = new int[2];
        try {
            for(int i=0; i<5; i++) 
                a[i] = sc.nextInt();
        }
        catch(Exception e) {
            System.out.println("Error due to: "+e);
        }
        sc.close();
    }
}
