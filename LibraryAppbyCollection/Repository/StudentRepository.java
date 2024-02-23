package Repository;

import java.util.*;

import Model.StudentModel;

public class StudentRepository {
    static ArrayList sl = new ArrayList<>();

    public int getId() {
        return sl.size();
    }

    public boolean addStudent(StudentModel model) {
        if (model != null) {
            sl.add(model);
            return true;
        } else
            return false;
    }

    public ArrayList getStudents() {
        return sl != null ? sl : null;
    }
}
