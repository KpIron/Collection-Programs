/*Write a Java program to insert the specified element at the specified position  
in the linked list.*/

package LinkedList;
import java.util.*;
public class Fourth {

	public static void main(String[] args) 
	{
		LinkedList ls = new LinkedList();
		ls.add('A');
		ls.add('B');
		ls.add('C');
		ls.add('D');
		ls.add('Z');
		ls.add('F');
		for(Object obj:ls)
		{
			System.out.println(ls.indexOf(obj)+ " ->" +obj);
		}
		System.out.println();
		ls.add(4, 'E');
		for(Object obj:ls)
		{
			System.out.println(ls.indexOf(obj)+ " ->" +obj);
		}
		
		
		

	}

}
