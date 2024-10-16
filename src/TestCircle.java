public class TestCircle {
	public static void main(String[] args) {
		Circle circle = new Circle(5, "green");
		System.out.println(circle);
		circle.setRadius(7.0);
		circle.setColor("red");
		System.out.println(circle);
		System.out.println("Perimeter of circle: " + circle.getPerimeter());
		System.out.println("Area of circle: " + circle.getArea());
	}
}
