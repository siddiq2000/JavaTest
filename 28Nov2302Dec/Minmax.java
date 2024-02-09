import java.util.*;
public class Minmax {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a[] = new int[5];
        System.out.println("Enter values in array");
        for(int i=0;i<5;i++){
            a[i] = s.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for(int i=1; i<5; i++){
            if(min>a[i]){
                min = a[i];
            }
            if(max<a[i]){
                max = a[i];
            }
        }
        System.out.printf("Min is %d\n Max is %d",min,max);
        s.close();
    }
}
