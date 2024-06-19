package main;

public class Person {


	   private String name;
	   private int age;


	   Person(){
	    this.age=18;
	   }

	    Person(String name , int age){
	        this.name= name;
	        this.age=age;
	   }

	  void  printPerson()  {
	    System.out.println("name :: " + name + " " + "age :: " + age + " ");
	   }
	  
}
