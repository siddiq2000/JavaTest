package Repository;

import java.util.*;

import Model.BookModel;

public class BookRepository {
    static ArrayList al = new ArrayList<>();

    public int getId() {
        return al.size();
    }

    public boolean addBook(BookModel model) {
        if (model != null) {
            al.add(model);
            return true;
        } else
            return false;
    }

    public ArrayList showAllBooks() {
        return al != null ? al : null;
    }
}
