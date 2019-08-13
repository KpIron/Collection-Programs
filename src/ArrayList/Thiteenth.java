 //Write a Java program of swap two elements in an array list.
package ArrayList;
import java.util.*;
public class Thiteenth {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("b");
		al.add("c");
		al.add("e");
		al.add('f');
		Collections.swap(al, 0, 2);
		System.out.println(al);
		

	}

}
