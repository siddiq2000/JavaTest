import java.util.*;
class ConverToUpper {
    private char c[];

    void setCharArray(char ch[]) {
        c=ch;
    }
    void convertToUpperCase() {
        for(int i=0; i<c.length; i++) {
            c[i] = Character.toUpperCase(c[i]);
        }
         System.out.println("Converted String "+ new String(c));
        
    }

}
public class ConvertToUpperApp {
    public static void main(String[] args) {
        char ch[];
        Scanner s = new Scanner (System.in);
        System.out.println("Enter String to convert Uppercase");
        String str = s.nextLine();
        ch = str.toCharArray();
        ConverToUpper c = new ConverToUpper();
        c.setCharArray(ch);
        c.convertToUpperCase();
       
        s.close();
    }
}
