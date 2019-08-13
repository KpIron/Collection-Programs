//4. Write a Java program to empty an hash set. Go to the editor

package HashSet;
import java.util.*;
public class EmptyHashSet {

	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add("Red");
		hs.add('c');
		hs.add("2");
		hs.add("Blue");
		
		Object obj = hs.removeAll(hs);
		System.out.println(obj);

	}

}
