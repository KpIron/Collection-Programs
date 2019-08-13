//Write a Java program to update specific array element by given element. 

package ArrayList;
import java.util.*;

public class Fifth 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("RED");
		al.add("BLUE");
		al.add("YELLOW");
		al.add("GREEN");
		System.out.print("Before updating elements: ");
		for(Object obj:al)
		{
			System.out.print(obj+ " ");
		}
		System.out.println();
		System.out.print("After updating element: ");
		al.set(1, "YELLOW");
		for(Object obj:al)
		{
			System.out.print(obj+ " ");
		}
	}

}
