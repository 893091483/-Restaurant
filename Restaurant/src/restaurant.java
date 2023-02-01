import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.Position.Bias;

public class restaurant {
	
	static Set<Integer> veg = new HashSet<>();
	static Set<Integer> nonVeg = new HashSet<>();
	

	public static void main(String[] args) {
		addMenu();
		Customer customer = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String customerName = sc.next();
		System.out.println("Enter your table");
		int customerTable = sc.nextInt();
		customer.setCustomerName(customerName);
		customer.setCustomerTableNumber(customerTable);
		
		
		WAITER waiter = new WAITER();
		
		
		System.out.print("hello "+ customerName +" please select the item number!!!!\r\n");
		waiter.menu();
		System.out.println();
		
		System.out.println(customerName + " is giving order !!!!");
		Order order = new Order();
		
		
		System.out.println("Enter number of items.....");
		int noItem = sc.nextInt();
		System.out.println("enter itemsNumbers and their quantity one by one...");
		
		order.setNoOfItems(noItem);
		int itemNo;
		int quantity;
		int [][] itemList = new int [noItem][noItem];
		for (int i = 0; i < noItem; i++) {
			System.out.println("---------------------------------------");
			 itemNo = sc.nextInt();
			 quantity = sc.nextInt();
			 itemList[i][0] = itemNo;
			 itemList[i][1] = quantity;
			 //System.out.println("itemList" + Arrays.toString(itemList[i]));
			 
			
		}
		order.setItems(itemList);
		customer.setOrder(order);
		System.out.println("---------------------------------------------------------------");
		
		waiter.takeOrder(customer);
		waiter.PlaceOrderToChef(order);
		VegChef vegChef = new VegChef();
		NonVegChef nonVegChef = new NonVegChef();
		
		boolean vegFlag = false;
		boolean nonVegFlag = false;
		for (int i = 0; i < order.noOfItems; i++) {
			 if(veg.contains(Integer.valueOf(order.Items[i][0]))) {
				 vegFlag = true;
			 }
			 if(nonVeg.contains(Integer.valueOf(order.Items[i][0]))) {
				 nonVegFlag = true;
			 }
		}
	
		
		if(vegFlag)
			 vegChef.vegSection(order);
		if(nonVegFlag)
			 nonVegChef.nonVegSection(order);
	
		
		
		customer.eat();
		
		BILL bill =  new BILL();
		bill.generateBill(customer);
		
		
	}
	public static void addMenu() {
		veg.add(2);
		veg.add(3);
		veg.add(4);
		veg.add(5);
		nonVeg.add(1);
		nonVeg.add(6);
		nonVeg.add(7);
		nonVeg.add(8);
		nonVeg.add(9);
		nonVeg.add(10);
	}
	
}
