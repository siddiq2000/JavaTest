import java.util.Scanner;
class Rectangle {
    private int len;
    private int wid;
    void setLengthWidth (int len, int wid) {
        this.len = len;
        this.wid = wid;
    }
    void showArea() {
        int Area = len * wid;
        System.out.println("Area of Rectangle "+Area);
    }
}
public class AreaRect {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter length and width of rectangle");
        int length = s.nextInt();
        int width = s.nextInt();
        Rectangle r = new Rectangle();
        r.setLengthWidth(length, width);
        r.showArea();
        s.close();
    }
}
