import java.util.*;
    
  public class StrongnumApp {
    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
          int lastDigit = num % 10;
          int factorial = 1;
          for (int i = 1; i <= lastDigit; i++) {
            factorial *= i;
          }
          sum += factorial;
          num /= 10;
        }
        return sum == originalNum;
      }
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isStrongNumber(number)) {
        System.out.println(number + " is a strong number.");
        } else {
        System.out.println(number + " is not a strong number.");
        }
        sc.close();
    }
}