package arraylist;

import java.util.ArrayList;

public class Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Blue");
		obj.add("Yellow");
		obj.add("Black");
		
		
		System.out.println(obj.get(2));
		String a= obj.get(1);
		System.out.println(a);
	}

}
