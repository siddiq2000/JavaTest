import java.util.*;
public class PrimeSumApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int sum=0;
       
        for(int i=2; i<=n; i++) {
            boolean isprime = true;
            for(int j=2; j<= Math.sqrt(i); j++) {
                if(i%j == 0) {
                    isprime = false;
                    break;
                }
                
            }
            if(isprime) {
                System.out.println(i);
                sum+=i;
            }
        }
        
        System.out.println("Sum "+sum);
        
        sc.close();
    }
}
