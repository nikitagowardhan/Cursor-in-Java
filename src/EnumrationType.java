import java.util.Collections;
import java.util.Enumeration;
import java.util.Stack;

public class EnumrationType {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("ram");
		s.push("sham");
		s.push("ram");
		s.push("om");
		s.push("geeta");
		s.push("om");
		s.push("sita");
		s.push("ram");
		s.push("om");
		
		Enumeration<String> en = Collections.enumeration(s);
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		
	}

}
