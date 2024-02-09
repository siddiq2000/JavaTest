import java.util.*;

class Employee {
    private int id, contact, salary;
    private String name, email, address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Company {
    void show(Employee ...e) {
        for(int i=0; i<e.length; i++) {
            System.out.println("Employee ID "+e[i].getId()+" Name "+e[i].getName()+" Email "+e[i].getEmail());
                        System.out.println("Contact "+e[i].getContact()+" Address "+e[i].getAddress()+" Salary "+e[i].getSalary()+"\n");
        }
    }
    void SearchEmp(int Id,Employee ...e) {
        for(int i=0; i<e.length; i++) {
            if(e[i].getId() == Id) {
                System.out.println("Employee ID "+e[i].getId()+" Name "+e[i].getName()+" Email "+e[i].getEmail());
                        System.out.println("Contact "+e[i].getContact()+" Address "+e[i].getAddress()+" Salary "+e[i].getSalary()+"\n");
            }
        }
    }
    void SearchEmp(String name, Employee ...e){
        for(int i=0; i<e.length; i++){
            if(e[i].getName() == name) {
                System.out.println("Employee ID "+e[i].getId()+" Name "+e[i].getName()+" Email "+e[i].getEmail());
                        System.out.println("Contact "+e[i].getContact()+" Address "+e[i].getAddress()+" Salary "+e[i].getSalary()+"\n");
            }
        }
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of employees");
        int num = s.nextInt();
        Employee e[] = new Employee [num];
             int choice,choice1;
            Company c = new Company();
            do {System.out.println(
                "Enter Choice 1.Add Employee Detail 2.Show Details 3.Search 4.Delete 5.Update 6.Sort 7.Display details in highest salary 8.Display details in 10000 to 50000 salary 9.Exit");
                 choice = s.nextInt();
                switch (choice) {
                    case 1:
                        for(int i=0; i<e.length; i++) {
                             e[i] = new Employee();
                            System.out.println("Enter Id");
                            e[i].setId(s.nextInt());
                            s.nextLine();
                            System.out.println("Enter name");
                            e[i].setName(s.nextLine());
                            System.out.println("Enter Email");
                            e[i].setEmail(s.nextLine());
                            System.out.println("Enter Contact");
                            e[i].setContact(s.nextInt());
                            s.nextLine();
                            System.out.println("Enter Address");
                            e[i].setAddress(s.nextLine());
                            System.out.println("Enter Salary");
                            e[i].setSalary(s.nextInt());
                        }
                        break;
                    case 2:
                        c.show(e);
                        break;
                    case 3:
                        System.out.println("Search by 1.Id 2.Name 3.Email 4.Salary 5.Address");
                        choice1 = s.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.println("Enter Id to search");
                                int id1 = s.nextInt();
                                c.SearchEmp(id1, e); 
                                break;
                            case 2:
                                System.out.println("Enter Name to Search");
                                String name1 = s.nextLine();
                                c.SearchEmp(name1, e);
                                break;
                            default:
                                break;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                
                    default:
                        break;
                }
            }   while(choice != 9);
        s.close();
    }
}