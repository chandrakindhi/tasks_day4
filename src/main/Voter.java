package main;

public class Voter{
	 private int id; 
     private String name;
      private int age;  
   
   public Voter( int id,String name, int age) throws Exception
   {
	     this.id = id;
         this.name = name;
          this.age = age;
          
          if(age < 18) {
        	  throw new Exception("Invalid age for voter");
          }
   }
   
   public static void main(String[] agr) {
	   try {
		Voter voter = new Voter(1,"Chandra",16);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}