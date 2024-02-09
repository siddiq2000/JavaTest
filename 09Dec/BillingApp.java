import java.util.*;
class Product {
    private int id, qty, rate;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class CalculateBill {
    void calBill (Product ...p) {
        int totalrate = 0;
        for(int i=0; i<p.length; i++) {
            System.out.println("ID "+p[i].getId()+" Name "+p[i].getName()+" Quantity "+p[i].getQty()+" Rate "+p[i].getRate());
            System.out.println("\t\t\tBill "+(p[i].getRate() * p[i].getQty()));
        }
        System.out.println("____________________________________");
        for (int i=0; i<p.length; i++) {
             totalrate = totalrate + (p[i].getRate() * p[i].getQty());
        }
        System.out.println("\t\tTotal Bill "+ totalrate);
    }
}
public class BillingApp {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Abc");
        p1.setQty(2);
        p1.setRate(10);

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Xyz");
        p2.setQty(5);
        p2.setRate(15);

        Product p3 = new Product();
        p3.setId(3);
        p3.setName("PQR");
        p3.setQty(3);
        p3.setRate(3);

        CalculateBill cb = new CalculateBill();
        cb.calBill(p1,p2,p3);
        s.close();
    }
}
