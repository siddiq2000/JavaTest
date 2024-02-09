import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a[] = new int [5];
        System.out.println("Enter values in array");
        for(int i=0; i<5; i++){
            a[i] = s.nextInt();
        }
        //reverse array
        int end = 4;
        for(int i=0; i<end; i++){
            int temp = a[i];
            a[i] = a[end];
            a[end] = temp;
            end--;
        }
        for(int i=0;i<5;i++){
            System.out.printf("a[%d]--%d\n",i,a[i]);
        }
        s.close();
    }
}
