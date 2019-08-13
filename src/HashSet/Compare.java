//Write a Java program to compare two hash set.

package HashSet;
import java.util.*;
public class Compare 
{
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Red");
		hs.add("Voilet");
		hs.add("Blue");
		hs.add("Yellow");
		System.out.println("First hash map: " +hs);
		
		HashSet hs2 = new HashSet();
		hs2.add("Red");
		hs2.add("Voilet");
		hs2.add("Yellow");
		hs2.add("Yellow");
		//hs2.add("Blue");
		System.out.println("Second hash map: "+hs2);
		
		HashSet hs3 = new HashSet();
		for(Object ob:hs)
		{
			System.out.println(hs2.contains(ob) ? " true":"false");
		}
	
	
	}

}
