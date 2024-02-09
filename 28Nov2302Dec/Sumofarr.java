import java.util.*;
public class Sumofarr {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter values in array");
        int a[] = new int[5];
        for(int i=0;i<5;i++){
            a[i] = s.nextInt();
        }
        int sum = 0;
        for(int i=0;i<5;i++){
            sum = sum + a[i];  
        }
        System.out.println("Sum of elements in array "+sum);
        s.close();
    }
}
