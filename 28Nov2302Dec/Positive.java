import java.util.*;
public class Positive {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a[] = new int [5];
        System.out.println("Enter values in array");
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<5;i++){
            if(a[i]>=0){
                System.out.printf("Number positive %d\n",a[i]);
            }
            else System.out.printf("Number is Negative %d\n",a[i]);
        }
        s.close();
    }
}
