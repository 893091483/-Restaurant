import java.util.Arrays;

public class Order {
	static int orderNum;
	int Items[][];
	int noOfItems;
	public Order() {
		orderNum++;
	}
	@Override
	public String toString() {
		return "Order [Items=" + Arrays.toString(Items) + ", noOfItems=" + noOfItems + "]";
	}
	public static int getOrderNum() {
		return orderNum;
	}
	public static void setOrderNum(int orderNum) {
		Order.orderNum = orderNum;
	}
	public int[][] getItems() {
		return Items;
	}
	public void setItems(int[][] items) {
		Items = items;
	}
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	public Order(int[][] items, int noOfItems) {
		super();
		Items = items;
		this.noOfItems = noOfItems;
	}
}
