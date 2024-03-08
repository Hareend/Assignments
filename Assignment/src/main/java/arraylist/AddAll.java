package arraylist;
import java.util.*;

public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> al = new ArrayList<String>();
	al.add("Red");
	al.add("Blue");
	al.add("Black");
	
	ArrayList<String> al1 = new ArrayList<String>();
	al1.add("hello");
	al1.add("hai");
	
	al.addAll(al1);
	System.out.println(al);

	}

}
