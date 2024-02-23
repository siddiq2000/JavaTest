package Services;

import java.util.*;
import Model.*;
import Repository.*;

public class StudentService {
    StudentModel smodel = new StudentModel();
    StudentRepository sRepo = new StudentRepository();
    BookRepository bRepo = new BookRepository();
    ArrayList sl, al;

    public StudentService() {
    }

    public StudentService(String name, String email, String contact) {
        int id = sRepo.getId();
        id += 1;
        smodel.setId(id);
        smodel.setName(name);
        smodel.setEmail(email);
        smodel.setContact(contact);
        boolean b = sRepo.addStudent(smodel);
        if (b) {
            System.out.println("Student added successfully");
        } else
            System.out.println("Student not added");
    }

    public ArrayList getStudents() {
        return sRepo.getStudents();
    }

    public boolean issueBook(String name, String bookname) {
        sl = sRepo.getStudents();
        al = bRepo.showAllBooks();
        if (sl.size() > 0 && al.size() > 0) {
            boolean studentFound = false;
            boolean bookFound = false;
            for (int i = 0; i < sl.size(); i++) {
                StudentModel smodel1 = (StudentModel) sl.get(i);
                if (smodel1.getName().equals(name)) {
                    studentFound = true;
                    break;
                }
            }

            for (int j = 0; j < al.size(); j++) {
                BookModel bmodel = (BookModel) al.get(j);
                if (bmodel.getName().equals(bookname) && bmodel.isStatus() == false) {
                    bookFound = true;
                    bmodel.setStatus(true);
                    break;
                }
            }
            if (!studentFound) {
                System.out.println("Student " + name + " not found in database");
            }
            if (!bookFound)
                System.out.println("Book " + bookname + " not found in library or already issued");

            if (studentFound && bookFound) {
                BookModel issuedBook = new BookModel();
                for (int i = 0; i < al.size(); i++) {
                    BookModel bModel = (BookModel) al.get(i);
                    if (bModel.getName().equals(bookname)) {
                        issuedBook = bModel;
                        break;
                    }
                }
                for (int i = 0; i < sl.size(); i++) {
                    StudentModel smodel = (StudentModel) sl.get(i);
                    if (smodel.getName().equals(name)) {
                        ArrayList temp = smodel.getBook();
                        temp.add(issuedBook);
                        smodel.setBook(temp);
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
}
