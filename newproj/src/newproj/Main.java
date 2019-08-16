package newproj;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		Order o=new Order();
		Product p=new Product();
		
		while(true) {
			System.out.println("Press 1 for Register a Customer");
			System.out.println("Press 2 for Customer Login");
			 Scanner in = new Scanner(System.in);  
	          System.out.print("Enter Choice: ");  
	          int ip = in.nextInt();  
	          if(ip==1) {
	        	  System.out.print("Enter Customer Name: ");
	        	  String name = in.next();  
		          System.out.print("Enter Password: ");
		          String pass = in.next();  
			      c.setName(name, pass);
					
				}

	          if(ip==2) {
	        	  System.out.print("Enter Customer Name: ");
	        	  String name = in.next();  
		          System.out.print("Enter Password: ");
		          String pass = in.next();  
			      boolean b = c.getName(name, pass);
			      if(!b) { 
			    	  System.out.print("Invalid Name or password");
			      continue;
			      } 
	        	  
	          }

			}

	}

}
