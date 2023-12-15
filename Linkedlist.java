package practice.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Linkedlist { 
	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Samara");  
		al.add("viswa");  
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		
		}  
		
		//Below code is for vector
		System.out.println();
		System.out.println();
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr1=v.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());
	}
	}}