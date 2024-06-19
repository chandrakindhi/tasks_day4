package com.test.spring;

import java.util.Scanner;

public class Palidrome {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any string:");
        String st=scanner.nextLine();
        String rev="";
        String sarray[]=st.split(" ");
        
        //[My dad bought me a racecar]
        //sarray=["My", "dad", "bought", "me" "a" "racecar"]
        
        for(int i=0;i<sarray.length;i++)
        {
            String word=sarray[i];
            if(word.length()>1)
            {
                for(int j=word.length()-1;j>=0;j--) 
                {
                    rev=rev+word.charAt(j); 
                }
                
                if(rev.equals(word))
                {
                    System.out.print(word+" ");
                }
                rev="";
            }
        }
    }

}