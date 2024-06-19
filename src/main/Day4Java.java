package main;

import java.util.Scanner;

import main.Person;
import main.Product;
import java.util.ArrayList;
public class Day4Java {

	public static void main(String[] args) {
		 Person person = new Person("chandra",21);
		    person.printPerson();
		    int size= 3;
		    
		    ArrayList<Product> products = new ArrayList<Product>();
			   
		    /*
		    for(int i =0;i<=size;i++) {
		        Scanner obj = new Scanner(System.in);
		        System.out.println("Input pid for the product " + i);
		        String pid = obj.next();
		        
		        System.out.println("entred pid is :"+pid);
		        System.out.println("Input price for the product" + i);
		        int price = Integer.parseInt(obj.next());
		        System.out.println("Input Quantity for the product " + i);
		        int quantity = Integer.parseInt(obj.next());
		        
		        Product product = new Product(pid,price,quantity);
		        products.add(product);
		        	
		    }
		       
		    int maxprice= products.get(0).getPrice();
		    String pid = products.get(0).getPid();
		    
		    for(int i =1;i<=size;i++) {
		    	if(maxprice < products.get(i).getPrice()) {
		    		pid =  products.get(i).getPid();
		    		maxprice = products.get(i).getPrice();
		    	}
		    }
		    System.out.println("max price :"+ maxprice +" for pid : " + pid);   
		        
		        totalSpent(products);
		        */
		        Account account= new Account("Chandra",30000.0f);
		        account.deposit_amount(12000.0f);
		        account.withdraw_amount(1200.0f);
		        account.display_balance();
		        
	}
	
	
	static void totalSpent(ArrayList<Product> products){
		int sum =0 ;
	    for(int i =0;i<=3;i++) {
	    	int val = products.get(i).getPrice()*products.get(i).getQuantity();
	    	sum = sum + val;
	    }
	    
	    System.out.println("Total amount spent " + sum);
	}

}


