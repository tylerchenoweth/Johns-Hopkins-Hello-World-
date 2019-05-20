// Tyler Chenoweth
// 5/20/19
// Johns Hopkin "Hello World"
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tyler's 'Hello World' Program...\n");
		
		// create rectangle
		Rectangle rect = new Rectangle(6,5);
		rect.printData();
		
		// create circle
		Circle circ = new Circle();
		circ.setRadius(6);
		circ.printData();
		
		// create triangle
		Triangle tri = new Triangle(3,8);
		tri.printData();
		
		// change triangle data
		tri.setBase(10);
		tri.setHeight(19);
		tri.printData();
	}

}
