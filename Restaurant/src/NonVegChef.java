import java.util.HashSet;
import java.util.Set;

public class NonVegChef extends Chef {


	public void nonVegSection(Order order) {
		
		System.out.println("your order reached Non-veg section");
		prepareOrder(order, "nonveg");
		
	}
}
