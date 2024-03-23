import java.util.*;

class Customer {
    private int id;
    private String name;
    private Order o[];

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Order[] getO() {
        return o;
    }

    public Customer() {
    }

    public Customer(int id, String name, Order[] o) {
        this.id = id;
        this.name = name;
        this.o = o;
    }
}

class Order {
    private int id, quantity, rate;

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getRate() {
        return rate;
    }

    public Order() {
    }

    public Order(int id, int quantity, int rate) {
        this.id = id;
        this.quantity = quantity;
        this.rate = rate;
    }

}

public class CustomerDiscountApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> al = new ArrayList<Customer>();
        for(int i=0; i<3; i++){
            System.out.println("Enter Customer Id, Name, number of orders");
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            int numOfOrder = sc.nextInt();
            Order order[] = new Order[numOfOrder];
            for(int j=0; j<numOfOrder; j++){
                System.out.println("Enter order id, quantity and rate");
                int oid = sc.nextInt(); sc.nextLine();
                int quantity = sc.nextInt();
                int rate  = sc.nextInt();
                if(numOfOrder>5){
                    rate = (int)(rate * 0.8);
                }
                order[j] = new Order(oid, quantity, rate);
            }
            Customer customer = new Customer(id, name, order);
            al.add(customer);
        }
        for (Customer c : al) {
            Order o[] = c.getO();
            System.out.println("Customer Id: "+c.getId()+"\t"+"Customer Name: "+c.getName());
            System.out.println("Customer Orders: ");
            for(int i=0; i<o.length; i++){
                System.out.println("Order id: "+o[i].getId()+"\t"+"Quantity: "+o[i].getQuantity()+"\t"+"Rate: "+o[i].getRate());
            }
            System.out.println("------------------------------");
        }
    }
}
