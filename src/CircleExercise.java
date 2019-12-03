import java.util.Scanner;

public class CircleExercise {
	//Buch Seite 73

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Radius erster Kreis: ");
		double radius1 = sc.nextDouble();
		System.out.println("Radius zweiter Kreis: ");
		double radius2 = sc.nextDouble();
		System.out.println("Radius dritter Kreis: ");
		double radius3 = sc.nextDouble();
		sc.close();
		//grundklasse aller klassen
		Object o1 = new Object();
		System.out.println("1. Kreis:");
		System.out.println("Radius: " + radius1);
		System.out.println("Umfang: "+(Circle.getCircumference(radius1)));
		System.out.println("Fläche: "+Circle.getArea(radius1));
		System.out.println("\n2. Kreis:");
		System.out.println("Radius: " + radius2);
		System.out.println("Umfang: "+Circle.getCircumference(radius2));
		System.out.println("Fläche: "+Circle.getArea(radius2));
		System.out.println("\n3. Kreis:");
		System.out.println("Radius: " + radius3);
		System.out.println("Umfang: "+Circle.getCircumference(radius3));
		System.out.println("Fläche: "+Circle.getArea(radius3));
		}
}
