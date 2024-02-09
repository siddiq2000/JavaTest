import java.util.*;
public class Searchele {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a[] = new int [5];
        System.out.println("Enter values in array");
        for(int i=0; i<5; i++){
            a[i] = s.nextInt();
        }
        System.out.println("Enter Search element");
        int skey = s.nextInt();
        int flag=0;
        for(int i=0;i<5;i++){
            if(skey==a[i]){
                flag = 1;
                break;
            }
        }
        if(flag==0) {
            System.out.println("Element not found");
        }
        else System.out.println("Element Found");
        s.close();
    }
}
