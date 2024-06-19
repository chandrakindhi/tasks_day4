package main;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	private int rollno;
	private String name;
	private int age;
	private String course;

	public Student(int rollno, String name, int age, String course) throws Exception {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;

		if (age > 15 && age < 21) {
			throw new AgeNotWithinRangeExecption("Invalid age for Student");
		}
		
	     Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");

	      Matcher matcher = pattern.matcher(this.name);
	 
	      if (!matcher.matches()) {
	           System.out.println("string '"+name + "' contains special character");
	           throw new NameNotValidExecption("name contains special characters");
	      } else {
	           System.out.println("string '"+name + "' doesn't contains special character");
	      } 
	}
	
	public static void main(String[] args) {
		
		try {
			Student student = new Student(1,"test*123",25,"Physics");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exception " + e.getMessage());
			//e.printStackTrace();
		}
		
		try {
			Student student1 = new Student(1,"test123",17,"Physics");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exception " + e.getMessage());
			//e.printStackTrace();
		}
	}
	
	

}




