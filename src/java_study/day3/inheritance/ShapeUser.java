package java_study.day3.inheritance;

public class ShapeUser {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(5);
		shapes[1] = new Circle(7);
		shapes[2] = new Rect(9, 5);
		
		for(int i = 0; i < shapes.length; i++) {
			System.out.println("shape[" + i + "]'s area = " + shapes[i].area());
			if (shapes[i] instanceof Rect) {
				System.out.println("shape[" + i + "]'s size = " + ((Rect)shapes[i]).getSize());
			}
		}
	}
}