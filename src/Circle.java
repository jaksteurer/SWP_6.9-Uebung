
public class Circle {
	private static double radius;
	private static boolean filled;
	public static double getRadius() { //GETTER-METHODE
		return radius;
	}
	public static void setRadius(double radius) { //SETTER-METHODE
		Circle.radius = radius;	//statt Circle kann man auch this schreiben
	}

	public boolean isFilled() { //GETTER-METHODE
		return filled;
	}
	public void setFilled(boolean filled) { //SETTER-METHODE
		Circle.filled = filled;	 //statt Circle kann man auch this schreiben
	}

	public static void main(String[] args) {
	}
	static double getCircumference (double radius) {
		return 2* SomeMaths.pi*radius;
	}
	static double getArea(double radius) {
		return SomeMaths.pi*(radius*radius);
	}
	Circle(double radius,boolean filled) {
		setRadius(radius);
		setFilled(filled);
	}
	Circle(double radius) {
		setRadius(radius);
		setFilled(false);
	}
	Circle() {
		setRadius(1);
		setFilled(false);
	}
}
