// Write a Java program to copy one array list into another.

package ArrayList;
import java.util.*;
public class Eight {

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("abc");
		al.add("def");
		al.add("ghi");
		al.add("jhk");
		System.out.print("First array list: ");
		for(Object obj:al)
		{
			System.out.print(obj+ " ");
		}
		System.out.println();
		//Copying first arrayList into another...
		System.out.print("Second Array list: ");
		ArrayList al2 = new ArrayList(al.size());
		for(Object obj2:al)
		{
			System.out.print(obj2+ " ");
		}
	}
}
