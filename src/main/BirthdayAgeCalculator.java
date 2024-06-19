package main;
import java.time.LocalDate; 
import java.time.Period; 
  
// Driver Class 
public class BirthdayAgeCalculator { 
    
    public static void main(String[] args) { 
      
        LocalDate birthdate = LocalDate.of(1997, 10, 03); 
  
        
        LocalDate currentDate = LocalDate.now(); 
  
         
        int age = calculateAge(birthdate, currentDate); 
  
      
        System.out.println("Age: " + age + " years"); 
        System.out.println("Age: " + age + " months"); 
        System.out.println("Age: " + age + " days"); 
    } 
  
    public static int calculateAge(LocalDate birthdate, LocalDate currentDate) { 
         
        Period period = Period.between(birthdate, currentDate); 
          
          return period.getYears();
    } 
}