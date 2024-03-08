package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> data = new LinkedHashSet<String>();
		{
			data.add("pink");
			data.add("orange");
			data.add("red");
		}
		System.out.println(data);
		
	//	data.set(1, "blue");
		System.out.println(data);
	}

}
