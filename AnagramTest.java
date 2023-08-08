package com.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramTest {
		     public static void main(String[] args) {
		      
		    	 System.out.println(isAnagram("anusha","aaunsh"));
		    	 System.out.println(isAnagram("kalyani","inaalyk"));
		    	 System.out.println(isAnagram("jyothi","ithyj"));

		    	 
		     }
		     public static boolean isAnagram(String s, String t) {

		    	 Map<Character,Long> firstMap=createMap(s);
		    	 Map<Character,Long> secondMap=createMap(t);
		    	 if(firstMap.equals(secondMap))
		    	     return true;
		    	     else
		    	     return false;
		    	  }
		     public static Map<Character,Long> createMap(String s){
		         List<Character> characters=new ArrayList<>();

		         for(Character c: s.toCharArray()){
		             characters.add(c);
		         }
		     Map<Character,Long> charactersVsCount=characters.
		     stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));  
		     return charactersVsCount;
		       } 
		     }


