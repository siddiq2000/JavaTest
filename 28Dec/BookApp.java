import java.util.*;
class Book {
    private int bid,bprice;
    private String bname,fauthor,bpublication;
    public int getBid() {
        return bid;
    }
    public void setBid(int bid) {
        this.bid = bid;
    }
    public int getBprice() {
        return bprice;
    }
    public void setBprice(int bprice) {
        this.bprice = bprice;
    }
    public String getBname() {
        return bname;
    }
    public void setBname(String bname) {
        this.bname = bname;
    }
    public String getFauthor() {
        return fauthor;
    }
    public void setFauthor(String fauthor) {
        this.fauthor = fauthor;
    }
    public String getBpublication() {
        return bpublication;
    }
    public void setBpublication(String bpublication) {
        this.bpublication = bpublication;
    }
}
public class BookApp{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bid,bprice,choice1;
        String bname,fauthor,bpublication;
        Book b[] = new Book[2];
        System.out.println("Enter Choice \n 1.Add Book 2.Display 3.Display by price betw 100 to 500 4.Search Book 5.Update Book 6.Delete Book 7.Count book details 8.Sort by Id 9.Exit");
        int choice = s.nextInt();
        do {
        switch (choice) {
            case 1:
                for(int i=0; i<b.length; i++){
                    b[i] = new Book();
                    System.out.println("Enter Book id"); bid = s.nextInt(); s.nextLine();
                    System.out.println("Enter Book name"); bname = s.nextLine(); 
                    System.out.println("Enter Book Price"); bprice = s.nextInt(); s.nextLine();
                    System.out.println("Enter Author"); fauthor = s.nextLine();
                    System.out.println("Enter Publication name"); bpublication = s.nextLine();
                    b[i].setBid(bid); b[i].setBname(bname); b[i].setBprice(bprice); b[i].setFauthor(fauthor); b[i].setBpublication(bpublication);
                }
                break;
            case 2:
                for(int i=0; i<b.length; i++) {
                    System.out.println("Book Id- "+b[i].getBid());
                    System.out.println("Book Name- "+b[i].getBname());
                    System.out.println("Book Price- "+b[i].getBprice());
                    System.out.println("Book Author- "+b[i].getFauthor());
                    System.out.println("Book Publication- "+b[i].getBpublication());
                }
                break;
            case 3:
                for(int i=0; i<b.length; i++) {
                    if(b[i].getBprice()>99 || b[i].getBprice()<501) {
                        System.out.println("Book Id- "+b[i].getBid());
                        System.out.println("Book Name- "+b[i].getBname());
                        System.out.println("Book Price- "+b[i].getBprice());
                        System.out.println("Book Author- "+b[i].getFauthor());
                        System.out.println("Book Publication- "+b[i].getBpublication());
                    }
                }
                break;
            case 4:
                System.out.println("Search book by 1.Id 2.Name 3.Price 4.Author");
                choice1 = s.nextInt();
                switch (choice1) {
                    case 1:
                        System.out.println("Enter id");
                        int sid  = s.nextInt();
                        for(int i=0; i<b.length; i++){
                            if(b[i].getBid() == sid) {
                                System.out.println("Book Id- "+b[i].getBid());
                                System.out.println("Book Name- "+b[i].getBname());
                                System.out.println("Book Price- "+b[i].getBprice());
                                System.out.println("Book Author- "+b[i].getFauthor());
                                System.out.println("Book Publication- "+b[i].getBpublication());
                            }
                        }
                        break;
                        case 2:
                            System.out.println("Enter Name");
                            String sname = s.nextLine();
                            for(int i=0; i<b.length; i++) {
                                if((b[i].getBname().equals(sname))) {
                                    System.out.println("Book Id- "+b[i].getBid());
                                    System.out.println("Book Name- "+b[i].getBname());
                                    System.out.println("Book Price- "+b[i].getBprice());
                                    System.out.println("Book Author- "+b[i].getFauthor());
                                    System.out.println("Book Publication- "+b[i].getBpublication());
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Enter Price"); int sprice = s.nextInt();
                            for(int i=0; i<b.length; i++) {
                                if(b[i].getBprice() == sprice) {
                                    System.out.println("Book Id- "+b[i].getBid());
                                    System.out.println("Book Name- "+b[i].getBname());
                                    System.out.println("Book Price- "+b[i].getBprice());
                                    System.out.println("Book Author- "+b[i].getFauthor());
                                    System.out.println("Book Publication- "+b[i].getBpublication());
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Enter Author name"); String sauthor = s.nextLine();
                            for(int i=0; i<b.length; i++) {
                                if(b[i].getFauthor().equals(sauthor)) {
                                    System.out.println("Book Id- "+b[i].getBid());
                                    System.out.println("Book Name- "+b[i].getBname());
                                    System.out.println("Book Price- "+b[i].getBprice());
                                    System.out.println("Book Author- "+b[i].getFauthor());
                                    System.out.println("Book Publication- "+b[i].getBpublication());
                                }
                            }
                    default:
                    System.out.println("Invalid Input");
                        break;
                }
                break;
            case 5:
                System.out.println("Update book by 1.Id 2.Name 3.Price 4.Publication");
                int choice2 = s.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println("Enter Id"); int uid = s.nextInt();
                        for(int i=0; i<b.length; i++) {
                            if(b[i].getBid() == uid) {
                                System.out.println("Enter Book id"); bid = s.nextInt(); s.nextLine();
                                System.out.println("Enter Book name"); bname = s.nextLine(); 
                                System.out.println("Enter Book Price"); bprice = s.nextInt();
                                System.out.println("Enter Author"); fauthor = s.nextLine();
                                System.out.println("Enter Publication name"); bpublication = s.nextLine();
                                b[i].setBid(bid); b[i].setBname(bname); b[i].setBprice(bprice); b[i].setFauthor(fauthor); b[i].setBpublication(bpublication);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Enter Name"); String uname = s.nextLine();
                        for(int i=0; i<b.length; i++) {
                            if(b[i].getBname().equals(uname)) {
                                System.out.println("Enter Book id"); bid = s.nextInt();
                                System.out.println("Enter Book name"); bname = s.nextLine();
                                System.out.println("Enter Book Price"); bprice = s.nextInt();
                                System.out.println("Enter Author"); fauthor = s.nextLine();
                                System.out.println("Enter Publication name"); bpublication = s.nextLine();
                                b[i].setBid(bid); b[i].setBname(bname); b[i].setBprice(bprice); b[i].setFauthor(fauthor); b[i].setBpublication(bpublication);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Enter Price"); int uprice = s.nextInt();
                        for(int i=0; i<b.length; i++) {
                            if(b[i].getBprice() == uprice) {
                                System.out.println("Enter Book id"); bid = s.nextInt();
                                System.out.println("Enter Book name"); bname = s.nextLine();
                                System.out.println("Enter Book Price"); bprice = s.nextInt();
                                System.out.println("Enter Author"); fauthor = s.nextLine();
                                System.out.println("Enter Publication name"); bpublication = s.nextLine();
                                b[i].setBid(bid); b[i].setBname(bname); b[i].setBprice(bprice); b[i].setFauthor(fauthor); b[i].setBpublication(bpublication);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Enter Publication name"); String upublication = s.nextLine();
                        for(int i=0; i<b.length; i++) {
                            if(b[i].getBpublication().equals(upublication)) {
                                System.out.println("Enter Book id"); bid = s.nextInt();
                                System.out.println("Enter Book name"); bname = s.nextLine();
                                System.out.println("Enter Book Price"); bprice = s.nextInt();
                                System.out.println("Enter Author"); fauthor = s.nextLine();
                                System.out.println("Enter Publication name"); bpublication = s.nextLine();
                                b[i].setBid(bid); b[i].setBname(bname); b[i].setBprice(bprice); b[i].setFauthor(fauthor); b[i].setBpublication(bpublication);
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
                case 6:
                    System.out.println("Delete book by 1.Id 2.Name 3.Price 4.Author 5.Publication");
                    int choice3 = s.nextInt();
                    switch (choice3) {
                        case 1:
                            System.out.println("Enter Id"); int did = s.nextInt();
                            for(int i=0; i<b.length; i++) {
                                if(b[i].getBid() == did) {
                                    for(int k=i; k<b.length-1; k++) {
                                        b[k] = b[k+1];
                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Enter Name"); String dname = s.nextLine();
                            for(int i=0; i<b.length; i++) {
                                if(b[i].getBname().equals(dname)) {
                                    for(int k=i; k<b.length-1; k++) {
                                        b[k] = b[k+1];
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Enter Price"); int dprice = s.nextInt();
                            for(int i=0; i<b.length; i++) {
                                if(b[i].getBprice() == dprice) {
                                    for(int k=i; k<b.length-1; k++) {
                                        b[k] = b[k+1];
                                    }
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Enter Author"); String dauthor = s.nextLine();
                            for(int i=0; i<b.length; i++) {
                                if(b[i].getFauthor().equals(dauthor)) {
                                    for(int k=i; k<b.length-1; k++) {
                                        b[k] = b[k+1];
                                    }
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 7:
                    int count=0;
                    for(int i=0; i<b.length; i++) {
                        count++;
                    }
                    System.out.println("Number of Total books "+count);
                break;
                case 8: 
                    Book temp;
                    for(int i=0; i<b.length; i++) {                    
                        for(int j=i; j<b.length-1; j++) {
                            if (b[i].getBid() < b[j].getBid()) {                     
                                 temp = b[i];
                                 b[i] = b[j];
                                 b[j] = temp;
                            }
                        }
                    }
                break;
            default:
                break;
            } 
        }   
        while (choice!=9); 
        s.close();
    }
}