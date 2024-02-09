import java.util.*;
public class Array1{
    public static void main(String x[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Sizze of Array\n");
        int size = s.nextInt();
        int a[] = new int[5];
        
        int l=a.length;
        System.out.println("Enter values in array");
        for(int i=0;i<l;i++){
            a[i]=s.nextInt();
        }
        System.out.println("\nDisplay Array");
        for(int i=0;i<l;i++){
            System.out.printf("a[%d]-->%d\n",i,a[i]);
        }
    }
}