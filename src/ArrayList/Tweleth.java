//Write a Java program to compare two array lists.

package ArrayList;
import java.util.*;
public class Tweleth {

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println(al);
		ArrayList al2 = new ArrayList();
		al2.add("A");
		al2.add("B");
		al2.add("E");
		al2.add("D");
		System.out.println(al2);
		ArrayList<String> l = new ArrayList<String>();
		for(Object obj:al)
		{
			l.add(al2.contains(obj)? "Yes" :"No");
		}
		System.out.println(l);
		
	}
}
