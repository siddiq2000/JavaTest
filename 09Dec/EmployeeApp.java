import java.util.*;
class Employee {
    private int id,basicSal;
    private String name;
    private float incSal=0;
    void setPersonalInfo (String name, int id, int basicSal) {
        this.id = id;
        this.basicSal = basicSal;
        this.name = name; 
    }
    void setProgressPer(int progress) {
        if (progress>=60){
             incSal = basicSal * 0.3f;
        }
    }
    void show() {
        System.out.println("Name of Employee "+name);
        System.out.println("Id of employee "+id);
        System.out.println("Basic Salary "+basicSal);
        if(incSal>0) {
            System.out.println("Incremented Salary "+incSal);
            System.out.println("Total Salary is "+ (basicSal+incSal));
        }
    }
}
public class EmployeeApp {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter Employee Name, Id, Salary");
        String name = s.nextLine();
        int id = s.nextInt();
        int basicSal = s.nextInt();
        System.out.println("Enter Progress of employee");
        int progress = s.nextInt();
        Employee e = new Employee();
        e.setPersonalInfo(name, id, basicSal);
        e.setProgressPer(progress);
        e.show();
        s.close();
    }
}
