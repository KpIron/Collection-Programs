/*Write a Java program to insert elements into the linked list 
at the first and last position.
*/

package LinkedList;
import java.util.*;
public class Fifth {

	public static void main(String[] args)
	{
		LinkedList ls = new LinkedList();
		
		
		ls.add("STRING");
		ls.add("Array");
		ls.add("Java");
		ls.addFirst('1');
		ls.addLast('e');
		for(Object obj:ls)
		{
			System.out.println(ls.indexOf(obj )+ "-> "+obj);
		}

	}

}
