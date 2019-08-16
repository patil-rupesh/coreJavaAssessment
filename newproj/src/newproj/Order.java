package newproj;

import java.util.ArrayList;
import java.util.List;

public class Order {
    
    List<Product> names=new ArrayList<Product>();

    public void addorder(Product p) {
		 names.add(p);
		 System.out.println("Success in adding");
	}
	public List<Product> getOrdes() {
		return this.names;
	}

}
