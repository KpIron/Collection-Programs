/*1.Write a Java program to remove first and last element from a linked list.
  2. Write a Java program to remove all the elements from a linked list

*/
package LinkedList;
import java.util.*;
public class RemoveElements {

	public static void main(String[] args) 
	{
		LinkedList ls = new LinkedList();
		ls.add("Java");
		ls.add("Program");
		ls.add("Testing");
		ls.add("Shashtra");
		System.out.println(ls);
		
		Object obj= ls.removeFirst();
		System.out.println(obj);
		
		Object obj2 = ls.removeLast();
		System.out.println(obj2);

		System.out.println(ls);
		
		/*Code for 2nd problem
		 * 2. Write a Java program to remove all the elements from a linked list
		 */
		LinkedList ls2 = new LinkedList();
		ls2.add("Java");
		ls2.add("Program");
		ls2.add("Testing");
		ls2.add("Shashtra");
		System.out.println(ls2);
		
		Object o = ls2.removeAll(ls2);
		System.out.println(o);
		
		System.out.println(ls2);

	}

}
