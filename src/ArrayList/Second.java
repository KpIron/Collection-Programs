package ArrayList;
import java.util.*;
public class Second 
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		int[] a = {10,2,4,14};
		Arrays.sort(a);
		System.out.println("After sorting array elements:");
		for(Object obj:a)
		{
			System.out.println(obj);
		}
		
	}
	

}
