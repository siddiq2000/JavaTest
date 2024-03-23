package Mess_Services;

import java.util.ArrayList;
import java.util.Stack;

import Mess_Model.customerModel;
import Mess_Repository.customerRepository;

public class customerService {
	   static customerRepository crepo=new customerRepository();
        public boolean registerCustomer(customerModel cm)
        {
			return crepo.registerCustomer(cm);
        	
        }
        public static ArrayList getallcustomer(){
            return crepo.getallcustomer();
        }
        public static boolean isCustomerRegistered(String customerName) {
            ArrayList<customerModel> allCustomers = crepo.getallcustomer();
            for (customerModel customer : allCustomers) {
                if (customer.getName().equalsIgnoreCase(customerName)) {
                    return true;
                }
            }
            return false;
        }
        public boolean checkCustomerExists(String roomCustomerName) {
            ArrayList<customerModel> allCustomers = crepo.getallcustomer();
            for (customerModel customer : allCustomers) {
                if (customer.getName().equalsIgnoreCase(roomCustomerName)) {
                    return true; // Customer with the provided name exists
                }
            }
            return false; // Customer with the provided name does not exist
        }

		
        
}
