
public class Customer {
	private String customerName;
	private int customerTableNumber;
	Order order;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerTableNumber=" + customerTableNumber + ", order="
				+ order + "]";
	}
	public int getCustomerTableNumber() {
		return customerTableNumber;
	}
	public void setCustomerTableNumber(int customerTableNumber) {
		this.customerTableNumber = customerTableNumber;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	void OrderingItems(Order order) {
		
		this.order = order;
	}
	public void eat() {
		System.out.println("Waiter Brought items to customer.");
		System.out.println(this.customerName + " is eating......");
	}

}
