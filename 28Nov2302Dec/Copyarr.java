import java.util.*;
public class Copyarr {
    public static void main (String x[]) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter Value in array");
        int a[] = new int [5];
        int b[] = new int [5];
        for(int i=0; i<5; i++)
            a[i] = s.nextInt();
        //Copy array
        for(int i=0; i<5; i++)
            b[i] = a[i];
        //Display array
        for(int i=0; i<5; i++)
            System.out.printf("%d\n",b[i]);
        s.close();
    }
}
