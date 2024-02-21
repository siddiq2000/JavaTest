import java.util.Scanner;
import java.util.Vector;

public class StudentDescApp {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
    
        for(int i=0; i<3; i++) {
            System.out.println("Enter student id");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter student name");
            String name = sc.nextLine();
            System.out.println("Enter student percentage");
            float per = sc.nextFloat();
            v.add(new Student(id, name, per));
        }
        for(Object o:v) {
            Student s = (Student)o;
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getPer());
        }
        for(int i=0; i<3; i++) {
            for (int j=i+1; j<3; j++) {
                Object prev  = v.get(i);
                Object next = v.get(j);
                Student s1 = (Student)prev;
                Student s2 = (Student)next;
                if(s1.getPer()<s2.getPer()) {
                    v.set(i, next);
                    v.set(j, prev);
                }
            }
        }
        for(Object o:v) {
            Student s = (Student)o;
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getPer());
        }
        sc.close();
    }
}
