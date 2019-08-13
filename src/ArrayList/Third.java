package ArrayList;

import java.util.ArrayList;

public class Third 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(6); //After inserting new element at 1st position
		System.out.println("original arraylist"); 
		for(Object obj:al)
		{
			System.out.print(obj+ " ");
		}
		//Element inserted...
		System.out.println();
		System.out.println("After inserting new element at 1st position");
		al.add(0, 11);
		for(Object obj:al)
		{
			System.out.print(obj+ " ");
		}
		
	}
	

}
