package LibraryUI;

import java.util.*;

import javax.sound.midi.Soundbank;

import Model.*;
import Services.*;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookService bService = new BookService();
        BookModel book = new BookModel();
        StudentService sService = new StudentService();
        StudentModel student = new StudentModel();
        do {
            System.out.println("1.Add book");
            System.out.println("2.View all book");
            System.out.println("3.Count Category wise book");
            System.out.println("4.Display all books category wise");
            System.out.println("5.Display Author book");
            System.out.println("6.Add student");
            System.out.println("7.Issue book to student");
            System.out.println("8.Show stock not issued");
            System.out.println("9.Show Student wise book/s");
            System.out.println("10.Delete Book/s by Author");
            System.out.println("11.Exit");
            System.out.println("Enter choice");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter book Name, Price, Author, Publication, Category");
                    String name = sc.nextLine();
                    int price = sc.nextInt();
                    sc.nextLine();
                    String author = sc.nextLine();
                    String publication = sc.nextLine();
                    String category = sc.nextLine();
                    bService = new BookService(name, price, author, publication, category);
                    System.out.println("----------------------------------");
                    break;
                case 2:
                    ArrayList al = new ArrayList<>();
                    al = bService.showAllBooks();
                    if (al.size() > 0) {
                        for (Object obj : al) {
                            book = (BookModel) obj;
                            System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getPrice() + "\t"
                                    + book.getAuthor() + "\t" + book.getPublication() + "\t" + book.getCategory() + "\t"
                                    + book.isStatus());
                        }
                    } else
                        System.out.println("No book in Library");
                    break;
                case 3:
                    System.out.println("Enter Category of book");
                    int count = 0;
                    category = sc.nextLine();
                    al = bService.showAllBooks();
                    if (al.size() > 0) {
                        for (Object obj : al) {
                            book = (BookModel) obj;
                            if (book.getCategory().equals(category))
                                ++count;
                        }
                        if (count > 0)
                            System.out.println("Number of book of category " + category + " are " + count);
                        else
                            System.out.println("No books of this category");
                    }
                    break;
                case 4:
                    al = bService.showAllBooks();
                    if (al.size() > 0) {
                        HashSet hcategory = new HashSet<>();
                        for (int i = 0; i < al.size(); i++) {
                            BookModel b1 = (BookModel) al.get(i);
                            if (!hcategory.contains(b1.getCategory())) {
                                hcategory.add(b1.getCategory());
                                System.out.println("Category " + b1.getCategory());
                                for (int j = i; j < al.size(); j++) {
                                    book = (BookModel) al.get(j);
                                    if (book.getCategory().equals(b1.getCategory())) {
                                        System.out.println(
                                                book.getId() + "\t" + book.getName() + "\t" + book.getPrice() + "\t"
                                                        + book.getAuthor() + "\t" + book.getPublication() + "\t"
                                                        + book.getCategory() + "\t"
                                                        + book.isStatus());
                                    }
                                }
                                System.out.println("----------------------------------------");
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter name of author");
                    author = sc.nextLine();
                    al = bService.showAllBooks();
                    if (al.size() > 0) {
                        count = 0;
                        for (Object obj : al) {
                            book = (BookModel) obj;
                            if (book.getAuthor().equals(author)) {
                                ++count;
                                System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getPrice() + "\t"
                                        + book.getPublication() + "\t" + book.getCategory() + "\t"
                                        + book.isStatus());
                            }
                        }
                        if (count == 0)
                            System.out.println("No books of this author");
                    } else
                        System.out.println("NO books in Library");
                    System.out.println("---------------------------------");
                    break;
                case 6:
                    System.out.println("Enter Student Name, Email, Contact");
                    name = sc.nextLine();
                    String email = sc.nextLine();
                    String Contact = sc.nextLine();
                    sService = new StudentService(name, email, Contact);
                    System.out.println("----------------------------------");
                    break;
                case 7:
                    System.out.println("Enter name of student who want to issue book");
                    name = sc.nextLine();
                    System.out.println("Enter book name to issue");
                    String bname = sc.nextLine();
                    boolean b = sService.issueBook(name, bname);
                    if (b)
                        System.out.println("Book Issued Successfully");
                    else
                        System.out.println("Book not issued");
                    System.out.println("----------------------------------");
                    break;
                case 8:
                    al = bService.showAllBooks();
                    if (al.size() > 0) {
                        for (Object obj : al) {
                            book = (BookModel) obj;
                            if (!book.isStatus()) {
                                System.out.println("Stock Available");
                                System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getPrice() + "\t"
                                        + book.getAuthor() + "\t" + book.getPublication() + "\t" + book.getCategory()
                                        + "\t"
                                        + book.isStatus());
                            }
                        }
                    } else
                        System.out.println("No book in Library");
                    System.out.println("----------------------------------");
                    break;
                case 9:
                    ArrayList sl = sService.getStudents();
                    if (sl.size() > 0) {
                        for (int i = 0; i < sl.size(); i++) {
                            ArrayList bk = new ArrayList<>();
                            student = (StudentModel) sl.get(i);
                            bk = student.getBook();
                            System.out.println("Student: "+student.getName());
                            System.out.println("_____________");
                            if(bk.size()>0) {
                                for (int j = 0; j < bk.size(); j++) {
                                    BookModel book1 = (BookModel) bk.get(j);
                                    System.out.println(
                                            book1.getId() + "\t" + book1.getName() + "\t" + book1.getPrice() + "\t"
                                                    + book1.getAuthor() + "\t" + book1.getPublication() + "\t"
                                                    + book1.getCategory() + "\t"
                                                    + book1.isStatus());
                                }
                            }
                            else System.out.println("No Book Alloted to "+student.getName());
                            System.out.println("_____________");
                        }
                    } else
                        System.out.println("No students found");
                    System.out.println("--------------------------------------");
                    break;
                case 10:
                    System.out.println("Enter Author name to delete book");
                    String aname = sc.nextLine();
                    al = bService.showAllBooks();
                    if (al.size() > 0) {
                        for (int i = 0; i < al.size(); i++) {
                            book = (BookModel) al.get(i);
                            if (book.getAuthor().equals(aname)) {
                                al.remove(i);
                            }
                        }
                        System.out.println("Book/s Deleted Successfully");
                    } else
                        System.out.println("No books in Library");
                    System.out.println("-----------------------------------");
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (true);
    }
}