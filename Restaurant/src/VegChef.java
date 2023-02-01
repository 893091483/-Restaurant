
import java.util.HashSet;
import java.util.Set;

public class VegChef extends Chef {
	

	
	public void vegSection(Order order) {
		
	
		System.out.println("your order reached veg section");
		prepareOrder(order, "veg");
		
		
	}
}
