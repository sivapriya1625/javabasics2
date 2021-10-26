package collections;

import java.util.*;  

public class DequeArraylist {
	
	public static void main(String[] args) {  
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("shivapriya");  
		deque.add("swetha");  
		deque.add("shivanarayana");  
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}  
		}  


}
