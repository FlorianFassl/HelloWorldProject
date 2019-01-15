package basics;

public class Kleine1x1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.print("Reihe von " + i + "\t");
			for (int x = 1; x <= 10; x++) {
				System.out.print((x*i) + "\t");
			}
			System.out.println();
	}

	}
}