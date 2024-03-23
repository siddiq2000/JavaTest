package Mess_Repository;

import java.util.ArrayList;

import Mess_Model.customerModel;

public class customerRepository {
	int cid = 0;
	ArrayList customer = new ArrayList();

	public boolean registerCustomer(customerModel cm) {
		cid++;
		cm.setCid(cid);
		return customer.add(cm);
	}

	public ArrayList getallcustomer() {
		return customer;
	}

}
