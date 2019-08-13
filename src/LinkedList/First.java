//Write a Java program to append the specified element to the end of a linked list.

package LinkedList;
import java.util.*;
public class First {

	public static void main(String[] args) 
	{
		LinkedList ls = new LinkedList();
		ls.add("A");
		ls.add("Hello");
		ls.add("Java");
		ls.add("Program");
		for(Object obj:ls)
		{
			System.out.print(obj+ " ");
		}
		ls.addLast("Of Collection"); //addLast is used to append a specific element to the last of linked list
		System.out.println(ls);

	}

}
