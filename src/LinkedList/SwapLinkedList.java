//Write a Java program of swap two elements in an linked list.
package LinkedList;
import java.util.*;
public class SwapLinkedList 
{
	public static void main(String[] args) {
		
		LinkedList ls = new LinkedList();
		ls.add("a");
		ls.add("Java");
		ls.add("Code");
		ls.add("Selenium");
		System.out.println(ls);
		
		/*
		 * 	This code is directly used one method from Collections class ie: Swap()
		 */
		
	   Collections.swap(ls, 0, 2);
		System.out.println(ls);
		
		
	}

}
