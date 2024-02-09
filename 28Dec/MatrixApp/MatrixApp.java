package MatrixApp;
import java.util.*;
public class MatrixApp {
    public static void main(String[] args) {
        Scanner xyz = new Scanner (System.in);
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        System.out.println("Enter VAlues in matrix A");
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                a[i][j] = xyz.nextInt();
            }
        }
        System.out.println("Enter VAlues in matrix B");
        for(int i=0; i<b.length; i++) {
            for(int j=0; j<b[i].length; j++) {
                b[i][j] = xyz.nextInt();
            }
        }
        // Addition a1 = new Addition();
        // a1.performOperation(a, b);
        // Substraction s = new Substraction();
        // s.performOperation(a, b);
        // ScalarMatrix s1 = new ScalarMatrix();
        // s1.performOper(a);
        // Multiplication m = new Multiplication();
        // m.performOperation(a, b);
        SumRowCol r = new SumRowCol();
        r.performOper(a);
        
        xyz.close();
    }
}
