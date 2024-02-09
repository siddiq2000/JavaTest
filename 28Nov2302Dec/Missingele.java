import java.util.*;
public class Missingele {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int i,j;
        int a[] = new int[5];
        System.out.println("Enter values in array");
        for(i=0; i<5; i++){
            a[i] = s.nextInt();
        }
        //Printing missing elements
        for(i=0; i<4; i++) {
            for(j=a[i]; j<(a[i+1]-1); ){
                System.out.printf("%d",++j);
            }
        }
        s.close();
    }
}
