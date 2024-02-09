import java.util.*;
public class StrCountApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alpha=0,digit=0,special=0;
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++) {
            if(c[i]>=67 && c[i]<=90 || c[i]>=97 && c[i]<=122) {
                alpha++;
            }
            else if(c[i]>='0' && c[i]<='9'){
                digit++;
            }
            else 
                special++;
        }
        System.out.println("No. of Digits "+digit);
        System.out.println("No. of Alphabets "+alpha);
        System.out.println("No. of Special Characters "+special);
        sc.close();
    }
}
