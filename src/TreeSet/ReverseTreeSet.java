// Write a Java program to create a reverse order view of the elements contained in a given tree set.
package TreeSet;
import java.util.*;
public class ReverseTreeSet {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(7);
		t.add(10);
		System.out.print("Original elements before reversing: " + " "+t);
		System.out.println();
		TreeSet t2 = new TreeSet(t);
		
		Object ob = t2.descendingSet();
		System.out.println("After the reversing: " +ob);

	}

}
