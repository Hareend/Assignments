package collections;

import java.util.ArrayList;

public class GenericEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al = new ArrayList<Integer>();
		ArrayList<Character> al1 = new ArrayList<Character>();
		ArrayList<String> al2 = new ArrayList<String>();
		
		al.add(100);
		al1.add('a');
		al2.add("Hareend");
		
		al.add(200);
		al1.add('b');
		al2.add("Java");
		System.out.print(al);
		System.out.print(al1);
		System.out.print(al2);
	}

}
