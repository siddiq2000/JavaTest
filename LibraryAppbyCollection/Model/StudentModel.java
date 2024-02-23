package Model;

import java.util.*;

public class StudentModel {
    private int id;
    private String name, email, contact;
    private ArrayList book;

    public StudentModel() {
        this.book = new ArrayList<>();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public ArrayList getBook() {
        return book;
    }

    public void setBook(ArrayList book) {
        this.book = book;
    }
}
