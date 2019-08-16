package newproj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class Customer {
	 HashMap<String,String> map=new HashMap<String,String>();
	 List<Product> names=new ArrayList<Product>();
	 
	 public void addorder(Product p) {
		 names.add(p);
		 System.out.println("Success in adding");
	}
	public void getOrdes() {
		ListIterator<Product> 
        iterator = names.listIterator(); 

    while (iterator.hasNext()) { 
        System.out.println(iterator.next().getName); 
    } 
	}
	

	 
	public boolean getName(String name, String pass) {
		if(this.map.get(name)==pass)
			return true;
		else return false;
	}
	public void setName(String name, String pass) {
		this.map.put(name,pass);
	}


}
