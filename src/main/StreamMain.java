package main;
import java.util.ArrayList;
import java.util.List;

public class StreamMain {

   
    static List<String> Students = new ArrayList<>();

    // preparing our data
    public static List getStudents(){

     
    	Students.add("Apoorava, Bujji");
    	Students.add("Karthik, Ramana");
    	Students.add("Apoorava, Eeshan");
    	Students.add("Keshav, Latha");
    	Students.add("Rithu, Meghna");

        return Students;
    }

    public static void main( String[] args ) {

        List<String> myPlaces = getStudents();
        System.out.println("Students from Apoorava:");
        
      
        myPlaces.stream()
                .filter((p) -> p.startsWith("Apoorava"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));
    }

}
