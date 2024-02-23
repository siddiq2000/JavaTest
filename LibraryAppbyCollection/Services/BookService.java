package Services;

import java.util.ArrayList;
import java.util.HashSet;

import Model.*;
import Repository.*;

public class BookService {
    BookRepository bRepo = new BookRepository();
    BookModel bmodel = new BookModel();

    public BookService() {
    }

    public BookService(String name, int price, String author, String publication, String category) {
        // bmodel.setId(id);
        bmodel.setName(name);
        bmodel.setPrice(price);
        bmodel.setAuthor(author);
        bmodel.setPublication(publication);
        bmodel.setCategory(category);
        int id = bRepo.getId();
        id += 1;
        bmodel.setId(id);
        boolean b = bRepo.addBook(bmodel);
        if (b)
            System.out.println("Book Added Successfully");
        else
            System.out.println("Book not Added");
    }

    public ArrayList showAllBooks() {
        ArrayList al = bRepo.showAllBooks();
        return al;
    }
}
