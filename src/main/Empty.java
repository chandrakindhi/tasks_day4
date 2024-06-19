package main;

import java.util.*;
class Empty {
	  public static void main(String[] args) {
	    
	   
	    String str1 = "abc";
	    String str2 = "";
	    String str3 = null;
	   
	    
	     System.out.println("str1 is " + isNullEmpty(str1));

	   	    System.out.println("str2 is " + isNullEmpty(str2));

	  	    System.out.println("str3 is " + isNullEmpty(str3));
	  }

	  public static String isNullEmpty(String str) {

		   
		    String abc = null;
			if (str == abc) {
		      return "NULL";
		    }

		
		    else if(str.isEmpty()){
		      return "EMPTY";
		    }

		    else {
		      return "neither NULL nor EMPTY";
		    }
		  }
		}