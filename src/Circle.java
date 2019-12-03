public class Circle {
	private static double radius; //standartm‰ﬂig: null
	private static boolean filled;//standartm‰ﬂig: false

	public static void main(String[] args) {
		Circle steurer = new Circle (1.0,false);//Objekt vom Typ Circle wird erstellt
		//Circle steurer = new Circle (1.0,);
		//Circle steurer = new Circle (); 
	}
	
	//GETTER-METHODE-------------------
	public static double getRadius() { 
		return radius;
	}
	//SETTER-METHODE-------------------
	public static void setRadius(double radius) { 
		if(radius <= 0)
		{
			System.out.println("Radius muss grˆﬂer als 0 sein");
			setRadius(1.0);
		}else {
			Circle.radius = radius;
			//statt Circle kann man auch this schreiben
		}
	}
	//GETTER-METHODE-------------------
	public boolean getFilled() { 
		return filled;
	}
	//SETTER-METHODE-------------------
	public void setFilled(boolean filled) { 
		Circle.filled = filled;
		//statt Circle kann man auch this schreiben
	}
	static double getCircumference () {
		return 2* SomeMaths.pi*radius;
	}
	static double getArea() {
		return SomeMaths.pi*(radius*radius);
	}
	//Default Konstruktoren------------
	Circle(double radius,boolean filled) {
		setRadius(radius);
		setFilled(filled);
	}
	Circle(double radius) {
		this(radius,false);
	}
	Circle() {
		//setRadius(1);		//statt diesen zwei Zeilen kann man auch this(1.0,false);
		//setFilled(false); 	//der andere Konstruktor wird so aufgerufen; Konstruktorverkettung
		this(1.0,false);
	}
	public void ausgabe(boolean filled) {
		System.out.println("Radius: "+getRadius());
		if(filled) {
			System.out.println("Fl‰che: "+getArea());
		}else {
			System.out.println("Umfang: "+getCircumference());
		}
	}
}
