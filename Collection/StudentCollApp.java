import java.util.*;
class Student{
    private int id;
    private String name;
    private float per;
    public Student(int id, String name, float per) {
        this.id=id;
        this.name=name;
        this.per=per;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public float getPer() {
        return per;
    }
}
public class StudentCollApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
    
        for(int i=0; i<5; i++) {
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
        System.out.println("Enter id to delete data");
        int did = sc.nextInt();
        for(Object o:v) {
            Student s = (Student)o;
            if(did==s.getId()) {
                v.removeElement(s);
            }
        }
        for(Object o:v) {
            Student s = (Student)o;
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getPer());
        }
        sc.close();
    }
}
