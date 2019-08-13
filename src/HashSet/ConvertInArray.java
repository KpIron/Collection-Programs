//Write a Java program to convert a hash set to an array
package HashSet;
import java.util.*;
public class ConvertInArray 
{
	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(5);
		hs.add(7);
		hs.add(4);
		Object[] a = new Object[hs.size()];
		hs.toArray(a);
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		
		
	}

}
