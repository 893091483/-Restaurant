import java.util.HashSet;
import java.util.Set;

public class BILL {
	
	static int TotalBill=0;
	Set<Integer> vegMenu = new HashSet<>();
	static String menu[] = {"Full meals","veg biriyani","veg Rice","veg Palav","veg Manchuria","gobi Nudles","chicken Biriyani","chicken65","chicken Curry","chicken Manchuria"};
	static int menuPrice[] = {100,150,50,100,50,50,200,200,100,150};
	public BILL() {
		// TODO Auto-generated constructor stub
	}
	public void generateBill(Customer c) {
		
		int dishNo=0;
		int quantity=0;
		int total =0;
	
		
		System.out.println("dear customer " + c.getCustomerName() + " your bill:");
		System.out.println("INVOICE");
		System.out.println("-------");
		System.out.println("item			Quant	Bill");
		System.out.println("----			-----	----");
		for (int i = 0; i < c.order.noOfItems; i++) {
			dishNo = c.order.Items[i][0];
			quantity = c.order.Items[i][1];
			if(vegMenu.contains(dishNo)) {
				total = quantity * menuPrice[dishNo-1];
				System.out.println( menu[dishNo-1]+ "		"+ quantity + "	" + total);
			}
			else {
				
				total = quantity * menuPrice[dishNo-1];
				System.out.println(menu[dishNo-1] + " 		"+ quantity + "	" + total);	
			}
			
			
			TotalBill += total;
		}
		
		System.out.println("                       		-----");
		System.out.println("Total Bill               	" + TotalBill);
		
	}
}
