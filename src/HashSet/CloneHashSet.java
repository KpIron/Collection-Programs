//Write a Java program to clone a hash set to another hash set
package HashSet;
import java.util.*;
public class CloneHashSet {

	public static void main(String[] args)
	{
		HashSet hs1 = new HashSet();
		hs1.add("String");
		hs1.add("Java");
		hs1.add("red");
		hs1.add("IronMan");
		System.out.println("The First HashSet: " + hs1);
		
		HashSet hs2 = new HashSet();
		Object obj = hs2.addAll(hs1);
		System.out.println("The second hashset: " +hs2);
	
	}

}
