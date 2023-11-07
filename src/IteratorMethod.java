import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethod {

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();

		a.add("ram");
		a.add("sham");
		a.add("geeta");
		a.add("mahi");
		
		//By using iterator method having two methods hasnext which check is there any element present in any index of array 
		 Iterator iterator = a.iterator();
		 
		 System.out.println("element : ");
		 
		int x=0;
		 
		 while(iterator.hasNext())
		 {
			 //next method print that value of check index
			 
			 if(x!=0)
				 //System.out.println(x); 
			 System.out.println(iterator.next() +" "+x);
			 
			 else
			 
				 iterator.next();
			 x++;
		 
			 }
		 
		 
		
		
	}

}
