//Write a Java program to extract a portion of a array list.

package ArrayList;
import java.util.*;
public class Eleventh {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("hello");
		al.add("java");
		al.add("Selenium");
		al.add("Testing");
		al.add("Automation");
		System.out.println(al);
		List<String> sb = al.subList(1, 3);
		System.out.println(sb);

	}

}
