public class Cylinder extends Circle {
	private double height;
	Cylinder(double r, String color, double h) {
		super(r, color);
		this.height = h;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return (2 * super.getArea()) + (super.getPerimeter() * this.height);
	}

	public double getVolume() {
		return super.getArea() * this.height;
	}

	@Override
	public String toString() {
		return "A Cylinder with radius = " + super.getRadius() + ", height = " + this.height
				+ ", color = " + super.getColor();
	}
}
