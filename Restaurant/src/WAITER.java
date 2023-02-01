import java.util.ArrayList;

public class WAITER {
	
	public WAITER() {
		// TODO Auto-generated constructor stub
	}
	String listitems [];
	Customer customer = new Customer();
	public void menu() {
		System.out.print( " [1.Full meals --100, 2.veg biriyani--150, 3.veg Rice--50, 4.veg Palav--100,\r\n"
			+ "5.veg Manchuria--50, 6.gobi Nudles--50, 7.chicken Biriyani--200, 8.chicken65-\r\n"
			+ "-200, 9.chicken Curry--100, 10.chicken Manchuria--150]");
		System.out.println();
	}
	public void takeOrder(Customer customer) {
		this.customer = customer;
	}
	public void PlaceOrderToChef(Order order) {
		System.out.println("waiter has placed order to chef..........");
	}
}
