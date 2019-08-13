// Write a Java program to iterate a linked list in reverse order.

package LinkedList;
import java.util.*;
public class Third {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.add("Java");
		ls.add("Program");
		ls.add("Testing");
		ls.add("Shashtra");
		System.out.print(ls);
		Iterator itr = ls.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}	
}
		
	


