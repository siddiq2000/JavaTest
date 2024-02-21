package Model;
import java.util.*;
public class Exam {
    private int id;
    private String name,date,starttime,endtime;
    private ArrayList questionBank;
    public ArrayList getQuestionBank() {
        return questionBank;
    }
    public void setQuestionBank(ArrayList questionBank) {
        this.questionBank = questionBank;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getStarttime() {
        return starttime;
    }
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }
    public String getEndtime() {
        return endtime;
    }
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
    public Exam() {}
    public Exam (int id, String name, String date, String starttime, String endtime) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.starttime = starttime;
        this.endtime = endtime;
    }
}
