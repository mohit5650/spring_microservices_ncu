package com.brainmentors.apps;

import java.util.Date;

public class TestORM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
		Customer customer = new Customer(1022,"ABCD",32323);
		CustomerCK customerCK =new CustomerCK();
		customerCK.setDob(new Date());
		customerCK.setEmail("Abcd@yahoo.com");
		customerCK.setPhone("43434434");
		customer.setCustomerCK(customerCK);
		dao.save(customer);
		//dao.save(new Customer(102, "bnbn",8888));

	}

}
