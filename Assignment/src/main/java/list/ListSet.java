package list;
import java.util.*;

public class ListSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj = new ArrayList<>();
		{
			obj.add("pink");
			obj.add("orange");
			obj.add("red");
		}
		System.out.println(obj);
		
		obj.set(1, "blue");
		System.out.println(obj);
	}

}
