package ecommerce;

public class Customer {

	public void walkin() {
		System.out.println("priya is going in big bazar");
		
	}

	public void shop() {
		System.out.println("customer is shopping");
		
	}

	public void checkout() {
		Cashier shivaCashier = new Cashier();
		shivaCashier.estimate();
		
		
	}

}
