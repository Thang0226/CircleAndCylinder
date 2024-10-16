public class TestCylinder {
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(2, "blue", 10);
		System.out.println(cylinder);
		cylinder.setRadius(12);
		cylinder.setColor("orange");
		cylinder.setHeight(7);
		System.out.println(cylinder);
		System.out.println("Area of the cylinder: " + cylinder.getArea());
		System.out.println("Volume of the cylinder: " + cylinder.getVolume());
	}
}
