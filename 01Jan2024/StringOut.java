// import java.util.*;
public class StringOut {
    public static void main (String[] args) {
        try {
        String name = "Siddiq";
        String s = name.substring(2,8);
        System.out.println(s);
         } catch (Exception e) {
            System.out.println("Error due to: "+e);
        }
    }
}
