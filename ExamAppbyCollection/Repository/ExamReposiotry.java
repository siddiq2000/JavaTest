package Repository;
import java.util.ArrayList;
import Model.Exam;

public class ExamReposiotry {
    private Exam model;
    QuestionRepository qRepo = new QuestionRepository();
    public boolean scheduleExam(Exam model) {
        
        ArrayList  al = qRepo.showAllQuestion();
        if (al.size()>0) {
            model.setQuestionBank(al);
            this.model = model;
            return true;
        }
        else return false;
    }
    public Exam getExamschedule() {
        return model!=null?model:null;
    }
}
