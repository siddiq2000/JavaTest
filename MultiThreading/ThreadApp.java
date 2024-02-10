

class A extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("I = " + i);
                sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }
}
class B extends Thread {
    public void run() {
        try {
            for(int i=0;i<=5; i++){
                System.out.println("Second Thread: "+i);
                sleep(1000);
            }
        } catch (Exception e) {
           System.out.println("Error is "+e);
        }
    }
}
public class ThreadApp {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        B b = new B();
        b.start();
    }
}