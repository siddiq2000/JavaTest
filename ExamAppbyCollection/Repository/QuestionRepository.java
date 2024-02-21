package Repository;
import java.util.*;
import Model.*;
public class QuestionRepository {
    @SuppressWarnings("rawtypes")
    static ArrayList al = new ArrayList<>();
    public int getId() {
        return al.size();
    }
    public boolean isAddQuestion(Question q) {
        boolean b = al.add(q);
        return b;
    }
    public ArrayList showAllQuestion () {
        return al;
    }
}
