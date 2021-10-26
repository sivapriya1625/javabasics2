package collections;

import java.util.*;  

public class StackArraylist {
	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>();  
		stack.push("amar");  
		stack.push("krish");  
		stack.push("arya");  
		stack.push("mouni");  
		stack.push("priya");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
	

}
