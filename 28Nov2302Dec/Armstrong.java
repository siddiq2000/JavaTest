import java.util.*;
public class Armstrong {
    public static void main(String x[]){
        int num,temp,rem,result=0,n=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number ");
        num = s.nextInt();
        temp=num;
        while(temp!=0){
            temp=temp/10;
            n++;
        }
        temp=num;
        double result1=0;
        while(temp!=0){
            rem=temp%10;
            result1 = result1 + Math.pow(rem,n);
            temp = temp/10;
        }
        result = (int)result1;
        if(result == num)
            System.out.println(num + " is Armstrong number");
        else System.out.println(num + " is not Armstrong Number");    
    }
}
