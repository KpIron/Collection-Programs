/*1) Write a Java program to remove and return the first element of a linked list.
 *2) Write a Java program to retrieve but does not remove, the first element of a linked list
 *3) Write a Java program to retrieve but does not remove, the last element of a linked list.
 * 
 */																													
package LinkedList;
import java.util.*;
public class RemoveDemos {

	public static void main(String[] args)
	{
		       // Code for 1st problem..........
		LinkedList ls = new LinkedList();
		ls.add("java");
		ls.add("testing");
		ls.add("automation");
		ls.add("node");
		System.out.println(ls);
		Object ob = ls.removeFirst();
		System.out.println(ob);
		System.out.println(ls);
		 		//Code for 2nd problem.....
		
		LinkedList l2= new LinkedList();
		l2.add("java");
		l2.add("testing");
		l2.add("automation");
		l2.add("node");
		System.out.println(l2);
		Object obj= l2.element();
		System.out.println(obj);

 		       // Code for 3rd problem........
		LinkedList l3 = new LinkedList();
		l3.add("java");
		l3.add("testing");
		l3.add("automation");
		l3.add("node");
		Object obj2 = l3.peekLast();
		System.out.println(obj2);	
		
	}

}
