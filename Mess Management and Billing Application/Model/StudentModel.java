package Model;

import java.util.ArrayList;

public class StudentModel {
    public class Student {
        private int studentID;
        private String name;
        private ArrayList<MessModel> messDetails;

        public int getStudentID() {
            return studentID;
        }

        public void setStudentID(int studentID) {
            this.studentID = studentID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<MessModel> getMessDetails() {
            return messDetails;
        }

        public void setMessDetails(ArrayList<MessModel> messDetails) {
            this.messDetails = messDetails;
        }

        public Student(int studentID, String name) {
            this.studentID = studentID;
            this.name = name;
        }

    }
}
