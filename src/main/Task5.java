package main;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

// Main class 
class abc { 
     
    public static void main(String args[]) 
    { 

              List<String> list = Arrays.asList("aBc", "d", "ef");
              List<String> upped = list.stream().map(String::toUpperCase).collect(Collectors.toList());
              
              System.out.println( upped);    }
    
}