//Write a Java program to remove the third element from a array list.

package ArrayList;

import java.util.ArrayList;

public class Sixth {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('e');
		System.out.println("Before Removing element: ");
		for(Object obj:al)
		{
			System.out.print(obj+ " ");
		}
		System.out.println();
		System.out.println("After removing element: ");
		al.remove(2);
		for(Object obj1:al)
		{
			System.out.print(obj1+ " ");
		}

	}

}
