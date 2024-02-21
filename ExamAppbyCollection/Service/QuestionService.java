package Service;
import java.util.ArrayList;
import Model.*;
import Repository.*;

public class QuestionService {
    QuestionRepository qRepo = new QuestionRepository();
    public boolean  isAddQuestion(Question q) {
        int qid = qRepo.getId();
        qid += 1;
        q.setId(qid);
        boolean b =qRepo.isAddQuestion(q);
        return b;
    }
    public  ArrayList showAllQuestion(){
        ArrayList al = qRepo.showAllQuestion();
         return al.size() > 0 ? al : null;
    }
}


