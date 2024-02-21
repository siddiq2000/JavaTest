import java.util.*;
public class ArrayListApp {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList al = new ArrayList();
        for(int i=0; i<5; i++) {
            System.out.println("Enter values in Arraylist");
            int data = sc.nextInt();
            al.add(data);
        }
        // int in = al.indexOf(2);
        // System.out.println("Found at "+in);
        for(Object o:al) {
            System.out.println(o);
        }
        for(int i=0; i<al.size(); i++) {
            for(int j=i+1; j<al.size(); j++){
            Object o1 = al.get(i);
            Object o2 = al.get(j);
                if((int)o1>(int)o2) {
                    al.set(i, o2);
                    al.set(j, o1);
                }
            }
        }
        for(Object o:al) {
            System.out.println(o);
        }
        sc.close();
    }
}