import java.util.*;
public class FrequencyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int count=0;
        String c = sc.nextLine();
        char[] ch = c.toCharArray();
        for(int i=0; i<ch.length; i++)
            count++;
        System.out.println("No. of character in string: "+count);
        for(int i=0; i<ch.length; i++) {
            int count1=1;
            for(int j=i+1; j<ch.length; j++) {
                if(ch[i] == ch[j])
                    count1++;
            }
            System.out.println("Frequency of "+ch[i]+":"+count1);
        }
        sc.close();
    }
}