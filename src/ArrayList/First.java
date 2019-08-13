package ArrayList;
import java.util.*;
public class First 
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
	    al.add("RED");
		al.add("YELLOW");
		al.add("ORANGE");
		al.add("GREEN");
		al.add("BLUE");
		//al.add(null);
		
		/*Iterator itr = al.iterator();
		 
			while(itr.hasNext())
			{
				System.out.println(al.indexOf(itr.next())+" "+itr.next());
			}
		 */
		for(Object obj:al)
		{
			System.out.println(al.indexOf(obj)+" - "+obj);
		}
	}
	
	

}
