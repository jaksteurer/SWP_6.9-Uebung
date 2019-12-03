
public class JakobCircle extends Circle {

	private String name;

	public static void main(String[] args) {
		
	}
	//Default Konstruktor
	JakobCircle() {
		this(1.0,false,null);
	}
	JakobCircle(String vname) {
		this(1.0,false,vname);
		//ODER (aber schlechter):
//		super();
//		this.name = vname;
	}
	JakobCircle(double radius){
		this(radius,false,null);
	}
	JakobCircle(double radius, boolean filled){
		this(radius,filled,null);
	}
	JakobCircle(double radius, boolean filled,String vname) {
		super(radius,filled); //Diese werden an den Konstruktor Circle der Parentklasse übergeben
		this.name = vname;
	}
	public void namepruefen() {
		if(name == "") {
			name = "Namenslos";
		}else {
			System.out.println("\n"+name+"\nhat folgende Maße:");
		}
	}

}