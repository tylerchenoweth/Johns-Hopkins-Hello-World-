
public class Rectangle extends Shape{
	
	double length;
	double width;
	
	Rectangle()
	{
		System.out.println("Rectangle!\n");
		length = 1;
		width = 1;
		setArea();
	}
	
	Rectangle(double l, double w)
	{
		System.out.println("Rectangle!\n");
		length = l;
		width = w;
		setArea();
	}
	
	void setWidth(double w)
	{
		width = w;
		setArea();
		
	}
	
	void setLength(double l)
	{
		length = l;
		setArea();
	}
	
	double getWidth()
	{
		return width;
	}
	
	double getLength()
	{
		return length;
	}
	
	void setArea()
	{
		super.area = length * width;
	}
	
	double getArea()
	{
		return super.area;
	}
	
	void printData()
	{
		super.printData(length, width, super.area, true);
	}
}
