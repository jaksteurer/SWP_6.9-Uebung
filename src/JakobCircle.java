
public class JakobCircle extends Circle {
	
	public static String Name;
	
	public static void main(String[] args) {
		Name = "Jakob Steurer";
		System.out.println (Name);
	}
	
	JakobCircle(double radius, boolean filled)
	{
		setRadius(radius);
		setFilled(filled);
	}
	JakobCircle(double radius) {
		setRadius(radius);
		setFilled(false);
	}
	JakobCircle() {
		setRadius(1);
		setFilled(false);
	}
}
