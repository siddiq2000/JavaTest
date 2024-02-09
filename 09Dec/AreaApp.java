import java.util.*;
class Circle {
    private float radius;
    void setRadius (float radius) {
        this.radius = radius;
    }
    void showArea() {
        float Area = 3.14f * radius*radius;
        System.out.println("Area of circle is "+Area);
    }
}
public class AreaApp {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter radius of circle ");
        int radius = s.nextInt();
        Circle c = new Circle();
        c.setRadius(radius);
        c.showArea();
        s.close();
    }
}