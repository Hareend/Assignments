package list;
import java.util.*;

public class ListOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj = new ArrayList<Integer>();
		{
			obj.add(5);
			obj.add(8);
			obj.add(2);
			obj.add(8);
			
			int firstoccurence = obj.indexOf(8);
			System.out.println(firstoccurence);
			int lastoccurence = obj.lastIndexOf(8);
			System.out.println(lastoccurence);
		}
		
	}

}
