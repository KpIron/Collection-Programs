/* Write a Java program to insert the specified element 
at the front of a linked list. Go to the editor
*/

package LinkedList;
import java.util.*;
public class Sixth {

	public static void main(String[] args) 
	{
		LinkedList ls = new LinkedList();
		ls.offerFirst("List");
		ls.add("java");
		ls.add("null");
		ls.add("Red");
		for(Object s:ls)
		{
			System.out.println(s);
		}
		

	}

}
