package Service;
import Model.Exam;
import Repository.ExamReposiotry;

public class ExamService {
    ExamReposiotry examRepo = new ExamReposiotry();
    public boolean scheduleExam(Exam model) {
        return examRepo.scheduleExam(model);
    }
    public Exam getExamschedule () {
        Exam model = examRepo.getExamschedule();
        return model;
    }
}
