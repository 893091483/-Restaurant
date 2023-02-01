
public class Chef {
	public void prepareOrder(Order order, String vegRnonVeg) {
		System.out.println("order number "+ order.orderNum + " is getting ready please wait ("+ vegRnonVeg +")");
		callWaiter(order,vegRnonVeg);
	}
	public void callWaiter(Order order,String vegRnonVeg) {
		System.out.println("order number "+ order.orderNum + " is  ready ("+ vegRnonVeg +")...");
		System.out.println(vegRnonVeg + " to waiter:you can now deliver items to customer");
		System.out.println("---------------------------------------------------------------");
	}
}
