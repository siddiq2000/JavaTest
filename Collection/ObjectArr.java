//import java.util.*;

public class ObjectArr {
    public static void main(String[] args) {
        Object obj[] = new Object[5];
        obj[0] = 123;
        obj[1] = "Sid";
        obj[2] = 3.14f;
        obj[3] = false;
        obj[4] = new java.util.Date();
        for(int i=0; i<obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}