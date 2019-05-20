
public class Shape {
	double area;
	
	Shape() {
		System.out.print("Created new shape... ");
	}
	
	void setArea()
	{
		area = 1 * 1;
	}
	
	void printData(double var1, double var2, double area, boolean s)
	{
		String sh;
		String var1Name;
		String var2Name;
		
		if(s == true)
		{
			sh = "Rectangle";
			var1Name = "Length";
			var2Name = "Width";
		}
		else
		{
			sh = "Triangle";
			var1Name = "Base";
			var2Name = "Height";
		}
		
		System.out.println(sh + " Details");
		System.out.println("-----------------");
		System.out.println(var1Name + " = " + var1);
		System.out.println(var2Name + " = " + var2);
		System.out.println("Area = " + area);
		System.out.println("");
	}
	
	void printData(double var1, double area)
	{
		System.out.println("Circle Details");
		System.out.println("-----------------");
		System.out.println("Radius = " + var1);
		System.out.println("Area = " + area);
		System.out.println("");
	}
}
