//3. Write a Java program to get the number of elements in a hash set. 
package HashSet;

import java.util.HashSet;

public class Number {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Red");
		hs.add('c');
		hs.add("2");
		hs.add("Blue");
		 Object obj = hs.size();
		 System.out.println(obj);

	}

}
