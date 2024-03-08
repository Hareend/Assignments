package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> al = new LinkedHashSet<String>();
		al.add("Blue");
		al.add("Yellow");
		al.add("Black");
		
		boolean obj = al.contains("Black");
		System.out.println(obj); //or//
		System.out.println(al.contains("blue"));
	}

}
