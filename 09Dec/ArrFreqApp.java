import java.util.*;
class ArrayFreqCount {
    private int a[];
    void setIntArray(int a[]) {
        this.a=a;
    }
    void countFreq() {
        for(int i=0; i<a.length; i++) {
            int count=0;
            for(int j=i; j<a.length; j++){
                if(a[j] == a[i]) {
                    count++;
                }
            }
            System.out.println("Freq of ELement "+a[i] +" is "+ count);
        }
    }
}
public class ArrFreqApp {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter values in array");
        int a[] = new int[5];
        for(int i=0; i<a.length; i++){
            a[i] = s.nextInt();
        }
        ArrayFreqCount afc = new ArrayFreqCount();
        afc.setIntArray(a);
        afc.countFreq();
        s.close();
    }
}
