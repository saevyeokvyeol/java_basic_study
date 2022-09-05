package java_study.day3.inheritance;

public class Circle extends Shape {
	protected int radius;
	
	public Circle() {}
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public double circumference() {
		return Math.PI * 2 * radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}	
}
