package aggregation;

public class Author {
	String authorname;
	String place;
	Book b;

	public Author(String authorname, String place, Book b)
	{
		this.authorname = authorname;
		this.place= place;
		this.b = b;
	}
	public void print()
	{
		System.out.println(b.age+" "+b.name);
		System.out.println(authorname+" "+place);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk = new Book("Hareend",36);
		Author au = new Author("Name","Trivandrum",bk);
		au.print();
	}

}
