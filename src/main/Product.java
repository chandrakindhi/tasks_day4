package main;

public class Product {
	
	private String pid;
	private int price;
	private int quantity;
	
		
	
	  Product(String pid, int price, int quantity){
		  this.pid = pid;
		  this.price = price;
		  this.quantity = quantity;
	  }
	   void printproduct() {
		   
		  
		  
		  
		 
	 }
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
