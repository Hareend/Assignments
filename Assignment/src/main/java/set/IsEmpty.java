package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> data = new LinkedHashSet<Integer>();
		
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(40);
		
		System.out.println("Current Data's are: "+data);
		System.out.println("Is Data Empty?"+data.isEmpty());
	}

}
