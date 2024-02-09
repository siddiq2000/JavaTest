import java.util.*;
public class CountStrdataApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int vow=0,space=0,con=0,w=0;
        for(int i=0; i<c.length; i++) {
            if (c[i]==32) {
                space++;
            }
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'){
               vow++; 
            }
            else if(c[i]>=67 && c[i]<=90 || c[i]>=97 && c[i]<=122){
                con++;
            }
        }
        String words[] = s.split(" ");
        for(String word:words) {
            w++;
        }
        System.out.println("Words "+w);
        System.out.println("Vowels "+vow);
        System.out.println("Spaces "+space);
        System.out.println("Consonants "+con);
        sc.close();
    }
}
