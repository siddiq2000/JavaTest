import java.util.Scanner;

public class perfectno {
    public static void main(String x[]) {
        int num,i=1,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number ");
        num = s.nextInt();
        while(i<num){
            if(num%i==0){
                sum=sum+i;
            }
            i++;
        }
        if(sum==num){
            System.out.println(num+" Perfect Number ");
        }
        else System.out.println("Number is not perfect");
    }
}