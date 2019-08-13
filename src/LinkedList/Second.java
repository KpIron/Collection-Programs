/*Write a Java program to iterate through all elements
 in a linked list starting at the specified position
*/
package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Second {

	public static void main(String[] args) 
	{
		LinkedList ls = new LinkedList();
		ls.add('A');
		ls.add('B');
		ls.add('C');
		ls.add('z');
		ListIterator ltr = ls.listIterator(1);  
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
	}

}
