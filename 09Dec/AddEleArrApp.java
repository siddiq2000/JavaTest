import java.util.Scanner;
class InsertArrEle {
    private int a[];
    void setIntArray(int a[]) {
        this.a = a;
    }
    void insertValueOnIndex(int index, int value){
        for(int i=a.length-2; i>=index; i--){
            a[i+1]=a[i];
        }
        a[index] = value;
    }
}
public class AddEleArrApp {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);    
        int a[] = new int [6];
        for(int i=0; i<5; i++)
            a[i] = s.nextInt();
        System.out.println("Enter index and value to input in array");
        int index = s.nextInt();
        int value = s.nextInt();
        InsertArrEle i1 = new InsertArrEle();
        i1.setIntArray(a);
        i1.insertValueOnIndex(index, value);
        for(int i=0; i<a.length; i++)
            System.out.printf("a[%d]-->%d\n",i,a[i]);
        s.close();    
    }
}
