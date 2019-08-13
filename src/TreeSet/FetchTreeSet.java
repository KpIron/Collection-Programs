/* 1)Write a Java program to get the first and last elements in a tree set
 * 2)Write a Java program to get the number of elements in a tree set
 * 3)Write a Java program to compare two tree sets.
 */
package TreeSet;
import java.util.*;
public class FetchTreeSet
{
	public static void main(String[] args) {
		
	
	TreeSet<String> ts1 = new TreeSet<String>();
	ts1.add("A");
	ts1.add("X");
	ts1.add("C");
	ts1.add("G");
	System.out.println(ts1);
	
	System.out.println("The first element is:" +ts1.first()+ "  " + "The last element is: " +ts1.last());	
	////////////////////////////////////******************///////////////////////////////////
	
	                         //Code for 2nd problem***********
	
	TreeSet<String> ts2 = new TreeSet<String>();
	ts2.add("A");
	ts2.add("CX");
	ts2.add("X");
	ts2.add("F");
	System.out.println(ts2);
	
	System.out.println(ts2.size());
		
							//Code for 3rd problem*************
	
	TreeSet<String> ts3 = new TreeSet<String>();
	
	for(Object ob:ts1)
	{
		System.out.println(ts2.contains(ob)? "Yes": "No");
	}
	}
}
