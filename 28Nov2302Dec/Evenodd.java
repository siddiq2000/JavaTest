import java.util.*;
public class Evenodd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int [5];
        System.out.println("Enter values in array");
        for(int i=0; i<5; i++){
            a[i] = s.nextInt();
        }
        for(int i=0; i<5; i++){
            if(a[i]%2==0){
                System.out.printf("Even number at a[%d]-->%d\n",i,a[i]);
            }
            else System.out.printf("Odd number at a[%d]-->%d\n",i,a[i]);
        }
        s.close();
    }
}
