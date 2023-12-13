package com.start.study3.himart;

public class HimartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notebook notebook = new Notebook();
		Cellphone phone = new Cellphone();
		Television tv = new Television();
		
		Customer customer = new Customer();
		customer.buy(tv);
		customer.buy(notebook);
		customer.buy(phone);
		customer.buy(notebook);
		customer.buy(notebook);
		customer.buy(notebook);
		customer.buy(phone);
		
		
	}

}
