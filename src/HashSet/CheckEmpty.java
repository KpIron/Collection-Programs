//5. Write a Java program to test a hash set is empty or not.

package HashSet;
import java.util.*;
public class CheckEmpty {

	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add("String");
		hs.add("Java");
		hs.add("red");
		hs.add("IronMan");
		Object obj= hs.containsAll(hs);
		System.out.println(obj);
		Object o = hs.isEmpty();
		System.out.println(o);
		hs.removeAll(hs);
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		
	}

}
