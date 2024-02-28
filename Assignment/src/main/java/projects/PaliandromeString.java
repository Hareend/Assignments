package projects;

public class PaliandromeString {
	public static boolean isPalindrome(String str) {
	    StringBuilder sb = new StringBuilder(str);
	    sb.reverse();
	    return str.equals(sb.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean palian = PaliandromeString.isPalindrome("Java");
		System.out.println("Given String is a paliandrome: "+palian);
	}

}
