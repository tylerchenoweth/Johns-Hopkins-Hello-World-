
public class Circle extends Shape {
	
	final double PI = 3.14159;
	double radius;
	
	Circle()
	{
		System.out.println("Cricle!\n");
		radius = 1;
		setArea();
	}
	
	Circle(double r)
	{
		System.out.println("Cirlce!\n");
		radius = r;
		setArea();
	}
	
	void setRadius(double r)
	{
		radius = r;
		setArea();
	}
	
	double getRadius()
	{
		return radius;
	}
	
	void setArea()
	{
		super.area= PI*(radius*radius);
	}
	
	double getArea()
	{
		return super.area;
	}
	
	void printData()
	{
		super.printData(radius, super.area);
	}
}
