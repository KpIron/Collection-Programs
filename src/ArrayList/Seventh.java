//Write a Java program to search an element in a array list.

package ArrayList;

import java.util.ArrayList;

public class Seventh {

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('e');
		System.out.println(al);
		if(al.contains('a'))
		{
			System.out.println("Found the element");
		}
		else
		{
			System.out.println("Element not found");
		}
		

	}

}
