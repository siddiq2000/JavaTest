import java.util.*;

class Student {
    int id, totalFees, actualPaidFees, disFees;
    String name;
    float per;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTotalFees() {
        return totalFees;
    }
    public void setTotalFees(int totalFees) {
        this.totalFees = totalFees;
    }
    public int getActualPaidFees() {
        return actualPaidFees;
    }
    public void setActualPaidFees(int actualPaidFees) {
        this.actualPaidFees = actualPaidFees;
    }
    public int getDisFees() {
        return disFees;
    }
    public void setDisFees(int disFees) {
        this.disFees = disFees;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPer() {
        return per;
    }
    public void setPer(float per) {
        this.per = per;
    }
}

class DiscountFees {
    Student student;
    void setStudent (Student student){
        this.student = student;
    }
    void checkDiscountEligibility(float per){
        if(per > 60) {
            int tfees = student.getTotalFees();
            int adis = (int) (tfees * (0.3f));
            student.setDisFees(adis);
            student.setActualPaidFees(tfees-adis);
        }
    }
    void show() {
        System.out.println("Student id "+ student.getId());
        System.out.println("Student Name "+ student.getName());
        System.out.println("Percentage "+ student.getPer());
        System.out.println("Total fees "+ student.getTotalFees());
        System.out.println("Actual fees paid "+ student.getActualPaidFees());
        System.out.println("Discounted Fees "+ student.getDisFees());
    } 
}

public class StudentDiscountApp {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter Student ID");
        int id = s.nextInt();
        s.nextLine();
        System.out.println("Enter Name");
        String name = s.nextLine();
        System.out.println("Enter Percentage");
        float per = s.nextFloat();
        s.nextLine(); 
        System.out.println("Enter Total Fees");
        int totalFees = s.nextInt();
        s.nextLine(); 
        Student s1 = new Student();
        s1.setId(id);
        s1.setName(name);
        s1.setPer(per);
        s1.setTotalFees(totalFees);
        DiscountFees d = new DiscountFees();
        d.setStudent(s1);
        d.checkDiscountEligibility(per);
        d.show();
        s.close();
    }
}