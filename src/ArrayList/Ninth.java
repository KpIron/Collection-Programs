// Write a Java program to shuffle elements in a array list.

package ArrayList;
import java.util.*;
public class Ninth 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
	}
}
