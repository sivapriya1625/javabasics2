package collections;

import java.util.*;  

public class LinkedArraylist {
	
	public static void main(String args[]){  
		  
		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("priya");  
		  al.add("amar");  
		  al.add("priya");  
		  al.add("krish");  
		  al.add("guru");
		  al.add("prasad");
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  

}
