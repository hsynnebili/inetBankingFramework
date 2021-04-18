package Oops;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape shape = new Circle("Red",0.25);
//		shape.getColor();
		
		Circle circle = new Circle("Blue  ",2.12);
		System.out.println(circle.toString());
		
		Rectangle reg = new Rectangle("Black",2.12,0.15);
		System.out.println(reg.toString());
	}
}
