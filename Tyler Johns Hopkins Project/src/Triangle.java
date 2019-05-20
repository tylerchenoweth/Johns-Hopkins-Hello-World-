
public class Triangle extends Shape {
	double base;
	double height;
	
	Triangle()
	{
		System.out.println("Triangle!\n");
		base = 1;
		height = 1;
		setArea();
	}
	
	Triangle(double b, double h)
	{
		System.out.println("Triangle!\n");
		base = b;
		height = h;
		setArea();
	}
	
	void setHeight(double h)
	{
		height = h;
		setArea();
		
	}
	
	void setBase(double b)
	{
		base = b;
		setArea();
	}
	
	double getWidth()
	{
		return height;
	}
	
	double getLength()
	{
		return base;
	}
	
	void setArea()
	{
		super.area = base * height;
	}
	
	double getArea()
	{
		return super.area;
	}
	
	void printData()
	{
		super.printData(base,height,super.area, false);
	}
}
