//Write a Java program to convert a hash set to a tree set
package HashSet;
import java.util.*;
public class ConvertInTree {

	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(5);
		hs.add(7);
		hs.add(4);
		System.out.println(hs);
		TreeSet ts = new TreeSet(hs);
		for(Object obj:ts)
		{
			System.out.println(obj);
		}
		

	}

}
