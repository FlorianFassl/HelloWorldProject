package rekursion;

public class Methoden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spezielleMethode();
		spezielleMethode();
		spezielleMethode();
		spezielleMethode();
		for (int i=0; i < 10; i++)
		spezielleMethode();
		
		addiere(10, 5);
		System.out.println(mult(8, 7));
		System.out.println(mult(6, 11));
		System.out.println(mult(3, 4));
	}
public static void spezielleMethode() {
	System.out.println("Ich bin speziell.");
}
public static void addiere (int zahlA, int zahlB) {
	System.out.println(zahlA + zahlB);
}

public static int mult(int zahlA, int zahlB) {
	int ergebnis= zahlA * zahlB;
	return ergebnis;
}
}
