import java.util.*;
class Per {
    void calPer(int marks[]) {
        int agg=0;
        for(int i=0; i<marks.length; i++){
            agg = agg + marks[i];
        }
        int percentage = agg/(marks.length-1);
        System.out.println("Percentage of Student- "+percentage);
    }
}
class CSE extends Per {
    private int id;
    private String name, address, Year;
    CSE(String name, int id, String address, String Year) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.Year = Year;
    }
    void showCsePer(int marks[]) {
        System.out.println("CSE Student Name-"+name+" ID-"+id+" Address-"+address+" Year-"+Year);
        calPer(marks);
    }
}
class ETC extends Per {
    private int id;
    private String name, address, Year;
    ETC(String name, int id, String address, String Year) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.Year = Year;
    }
    void showEtcPer(int marks[]) {
        System.out.println("ETC Student Name-"+name+" ID-"+id+" Address-"+address+" Year-"+Year);
        calPer(marks);
    }
}
public class ResultApp {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int marks[] = new int [6];
        int marks1[] = new int [6];
        System.out.println("Enter marks for CSE student");
        for(int i=0; i<marks.length; i++){
            marks[i] = s.nextInt();
        }
        System.out.println("Enter marks for ETC student");
        for(int i=0; i<marks1.length; i++){
            marks1[i] = s.nextInt();
        }
        CSE c = new CSE("Mahesh", 01, "Pune", "2021");
        c.showCsePer(marks);
        ETC e = new ETC("Mugera", 12, "Karad", "2023");
        e.showEtcPer(marks1);
        s.close();
    }
}