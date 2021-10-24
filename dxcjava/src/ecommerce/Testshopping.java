   package ecommerce;

public class Testshopping {
	public static void main(String[] args) {
		
		Customer customerpriya = new Customer(); 
		customerpriya.walkin();
		Security maxSecurity = new Security();
		boolean isCustomer = maxSecurity.scan(customerpriya);
		if(isCustomer) {
			customerpriya.shop();
		}
		
		customerpriya.checkout();
	}

}