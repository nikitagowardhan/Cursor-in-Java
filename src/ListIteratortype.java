import java.util.ArrayList;
import java.util.ListIterator;
//using ListIterator
public class ListIteratortype {

	public static void main(String[] args) {

		ArrayList<String> arrlist = new ArrayList<String>();  
		arrlist.add("d");  
		arrlist.add("dd");  
		arrlist.add("ddd");  
		arrlist.add("dddd");  
		arrlist.add("ddddd");  
		System.out.println(arrlist); 

	ListIterator iterator = arrlist.listIterator(2);
	
	while(iterator.hasNext())
		
	{
	    System.out.println(iterator.next());
	}
	
	//using hasprevious method
	while(iterator.hasPrevious())
		{
		System.out.println("Previos List : ");
		System.out.println(iterator.previous());
	}
	}
}
