package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class HasNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Black");
		colors.add("Yellow");
		
		Iterator<String> it = colors.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
