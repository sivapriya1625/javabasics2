package collections;

import java.util.*; 

public class Arraylist {
	
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("priya");//Adding object in arraylist  
		list.add("shiva");  
		list.add("swetha");  
		list.add("narayana");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
} 


