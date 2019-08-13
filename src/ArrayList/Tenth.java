//Write a Java program to reverse elements in a array list

package ArrayList;
import java.util.*;
public class Tenth {
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(11);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		 Collections.reverse(al);
		System.out.println(al);

	}

}
