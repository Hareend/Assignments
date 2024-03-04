package list;

import java.util.ArrayList;
import java.util.List;

public class ListOccuranceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj = new ArrayList<String>();
		{
			obj.add("Hello");
			obj.add("Good");
			obj.add("Morning");
			obj.add("Good");
			
			int firstoccurence = obj.indexOf("Good");
			System.out.println(firstoccurence);
			int lastoccurence = obj.lastIndexOf("Good");
			System.out.println(lastoccurence);
		}
	}
}

