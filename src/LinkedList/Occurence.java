//Write a Java program to get the first and last occurrence of the specified elements
package LinkedList;
import java.util.*;
public class Occurence {

	public static void main(String[] args) 
	{
		LinkedList ls = new LinkedList();
		ls.add("REd");
		ls.add("Green");
		ls.add("Pink");
		ls.add("Blue");
		System.out.println(ls);
		
		Object obj = ls.getFirst();
		System.out.println(obj);
		
		Object obj2 = ls.getLast();
		System.out.println(obj2);

	}

}
