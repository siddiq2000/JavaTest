package Model;

public class Student {
    private int id;
    private String name;
    private Exam model;
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
    public Exam getModel() {
        return model;
    }
    public void setModel(Exam model) {
        this.model = model;
    }

}
