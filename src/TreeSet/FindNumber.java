//Write a Java program to find the numbers less than 7 in a tree set.
package TreeSet;
import java.util.*;
public class FindNumber {

	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(4);
		ts.add(24);
		ts.add(16);
		ts.add(7);
		System.out.println(ts.lower(7));
		

	}

}
