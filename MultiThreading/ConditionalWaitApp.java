class Table extends Thread {
     synchronized void showTable(int x){
        try {
            for(int i=1;i<=10; i++) {
                System.out.println(x+"X"+i+"="+i*x);
                if (i==5) {
                    wait();
                }
                Thread.sleep(1000);
                notifyAll();
              
            }
        } catch (Exception e) {
            System.out.println("Error due to "+e);
        }
    }
}
class Two extends Thread {
    Table table;
    public void setTable(Table table) {
        this.table=table;
    }
    public void run() {
        table.showTable(2);
    }
}
class Three extends Thread {
    Table table;
    public void setTable(Table table) {
        this.table = table;
    }
    @Override
    public void run() {
        table.showTable(3);
    }
}


public class ConditionalWaitApp {
    public static void main(String[] args) {
    Table t = new Table();
        Two tw = new Two();
        tw.setTable(t);
        tw.start();
        Three th = new Three();
        th.setTable(t);
        th.start();
    }
}
