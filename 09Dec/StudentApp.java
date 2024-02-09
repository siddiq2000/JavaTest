import java.util.*;
class Student1 {
    private int s[];
    private int Per;
    void setSubMarks(int s[]) {
        this.s = s;
    }
    void calculatePer() {
        int sum=0;
        for(int i=0; i<s.length; i++){
             sum = sum + s[i];
        }
        Per = sum/6; 
    }
    void checkGrades() {
        if(Per>75 && Per<=100)
            System.out.println("Student in Dinstinction");
        if (Per>60 && Per<=75)
            System.out.println("First Division");
        if(Per>=50 && Per<=60)
            System.out.println("Second Division");
        if(Per>40 && Per<=50)
            System.out.println("Third Division");
        if(Per<40)
            System.out.println("Student Falied");
    }
}
public class StudentApp {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        int s[] = new int[6];
        System.out.println("Enter 6 Subject Students marks");
        for(int i=0; i<s.length; i++){
            s[i] = x.nextInt();
        }
        Student1 s1 = new Student1();
        s1.setSubMarks(s);
        s1.calculatePer();
        s1.checkGrades();
        x.close();
    }
}
