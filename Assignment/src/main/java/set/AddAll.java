package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> data = new LinkedHashSet<String>();
		data.add("Red");
		data.add("Blue");
		data.add("Black");
		
		Set<String> data1 = new LinkedHashSet<String>();
		data1.add("hello");
		data1.add("hai");
		
		data.addAll(data1);
		System.out.println(data);
	}

}
