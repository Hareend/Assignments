package arraylist;

import java.util.ArrayList;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Blue");
		al.add("Yellow");
		al.add("Black");
		
		boolean obj = al.contains("Black");
		System.out.println(obj); //or//
		System.out.println(al.contains("blue"));
	}

}
