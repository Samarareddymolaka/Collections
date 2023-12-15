package practice.collections;

import java.util.Iterator;
import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();  
		stack.push("samara");  
		stack.push("teja");  
		stack.push("anji");  
		stack.push("Amit");  
		stack.push("Ayush");  //now stack has samara, teja, anji, Amit, Ayush
		stack.pop();  //removes Ayush
		stack.pop(); //removes Amit
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
	}

}
}