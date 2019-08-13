/* 1)Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
 * 
 * 2)Write a Java program to iterate through all elements in a tree set.
   
   3)Write a Java program to add all the elements of a specified tree set to another tree set.
*/
package TreeSet;
import java.util.*;
public class FirstTreeSet 
{
	public static void main(String[] args)
	{
		             //Code for the First and second problem both **********
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("Red");
		ts1.add("Violet");
		ts1.add("Yellow");
		ts1.add("Green");
		Iterator itr = ts1.iterator();
		while(itr.hasNext())
		{
			System.out.println("Elements of 1st tree set: "+itr.next());
		}
		
					//Code for the Third problem***********
		
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.addAll(ts1);
		System.out.println("Elements of 2nd tree set: "+ts2);
		
	}
}
