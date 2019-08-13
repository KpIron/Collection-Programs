//rite a Java program to convert a hash set to a List/ArrayList.

package HashSet;
import java.util.*;
public class ConvertInList {

	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("red");
		hs.add("Ball");
		hs.add("orange");
		hs.add("Blue");
		hs.add(null);
		System.out.println(hs);
		
		ArrayList al = new ArrayList(hs);
		for(Object ob:al)
		{
			System.out.println(ob);
		}
		System.out.println();
		LinkedList l = new LinkedList(hs);
		for(Object ob:l)
		{
			System.out.println(ob);
		}
	}

}
