import java.util.*;
class Seller {
    private int sp,cp;
    void acceptSellingCostPrice (int sp, int cp) {
        this.sp = sp;
        this.cp = cp;
    }
    void showProfitLoss() {
        if(sp > cp) {
            System.out.println("Profit "+ (sp-cp));
        }
        else System.out.println("Loss "+ (cp-sp));
    }
}
public class SellerApp {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter Cost Price and Selling Price");
        int cp = s.nextInt();
        int sp = s.nextInt();
        Seller s1 = new Seller();
        s1.acceptSellingCostPrice(sp, cp);
        s1.showProfitLoss();
        s.close();
    }
}
