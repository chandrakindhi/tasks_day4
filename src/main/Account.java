package main;

public class Account {
 private String name;
 private float balance;
 Account(){
	 this.name="";
	 this.balance=0;
	 			
 }
 Account(String name,float balance){
	 this.name=name;
	 this.balance=balance;
	 
 }
 
public float deposit_amount(float amount){
	 this.balance=this.balance+amount;
	 return this.balance;
 }
 
public float withdraw_amount(float amount){
	 this.balance=this.balance-amount;
	 return this.balance;
 
}
public void display_balance() {
	System.out.println(this.balance);
}
}

