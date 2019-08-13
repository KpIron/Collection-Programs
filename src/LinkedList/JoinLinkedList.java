/* 1)Write a Java program to join two linked lists
   2)Write a Java program to clone an linked list to another linked list. 
*/
package LinkedList;
import java.util.*;
public class JoinLinkedList {

	public static void main(String[] args) {
		
		LinkedList ls = new LinkedList();
		ls.add("Java");
		ls.add("Program");
		ls.add("Testing");
		ls.add("Shashtra");
	
		System.out.print("First linked list:");
		System.out.print(ls+" ");
		
		System.out.println();
		System.out.print("Second linked list:");
		LinkedList ls2 = new LinkedList();
		ls2.add('J');
		ls2.add('P');
		ls2.add('T');
		ls2.add('S');
		System.out.println(ls2);
		
		 LinkedList ls3= new LinkedList();
		 ls3.addAll(ls);
		 ls3.addAll(ls2);
		 System.out.println("The joined linked list are: ");
		 System.out.println(ls3);
		
		           //Code for 2nd problem......
	
		 LinkedList l = new LinkedList();
		 l.addAll(ls);
		 System.out.println(l);
		 
		 LinkedList l2 = new LinkedList();
		 l2=(LinkedList)l.clone();
		 System.out.println(l2);
	
	
	}

}
