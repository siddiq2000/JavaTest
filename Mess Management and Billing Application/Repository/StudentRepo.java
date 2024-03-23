package Repository;

import java.util.*;

import Model.*;

public class StudentRepo {
    LinkedHashMap<Integer,StudentModel> studentMap= new LinkedHashMap<Integer,StudentModel>();

    public boolean insertStudentData(StudentModel smodel) {
        StudentModel key = studentMap.get(smodel);

        if(smodel!=null){
            if(key==null){
            studentMap.put(1, smodel);
            }
            else{
                
            }
            return true;
        }
        else 
        return false;
    }
}
