package projects;

public class Area {
	double pi=3.14, circle;
	public Area(double r)
	{
		circle = pi*r*r;
		System.out.println("Area of a CIrcle is:"+circle);
	}
	public Area(int l, int w)
	{
		int rectangle = l*w;
		System.out.println("Area of a Rectangle is:" +rectangle);
	}
	public Area(int s)
	{
		int square = s*s;
		System.out.println("Area of a Square is: "+square);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area obj= new Area(10.0);
		Area obj1 = new Area(5,5);
		Area obj2 = new Area(5);
	}

}
