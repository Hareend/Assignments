package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> data = new LinkedHashSet<Integer>();
		
		data.add(10);
		data.add(20);
		data.add(30);
		
		System.out.println("Datas:"+data);
		
		data.clear();
		System.out.println("After Clear: "+data);

	}

}
