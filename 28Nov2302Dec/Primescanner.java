import java.util.*;
public class Primescanner {
    public static void main(String x[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = s.nextInt();
        int flag=0;
        for(int i=2;i<num/2;i++){
            if(num%i==0) {
                flag=1;
                System.out.printf("Number not Prime");
                break;
            }
        }
        if (flag==0)
            System.out.printf("Number Prime %d",num);
    }
}
