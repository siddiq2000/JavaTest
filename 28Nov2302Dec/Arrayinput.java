import java.util.*;
public class Arrayinput {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter size of Array");
        int size = s.nextInt();
        int a[] = new int [size];
        int l = a.length;
        System.out.println("Enter values in array ");
        for(int i=0;i<l;i++){
            a[i] = s.nextInt();
        }
        //Display array
        for(int i=0;i<l;i++){
            System.out.printf("a[%d]-->%d\n",i,a[i]);
        }
        s.close();
    }
}