package basics;

public class Schleife2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // vor der Schleife
		System.out.println("vor");
		// w�hrend der Schleife
		for (int i = 0; i < 3; i++) {
			System.out.println("w�hrend");
		}
		// nach der Schleife
		System.out.println("nach");
		//
		//inneren und �u�eren Schleife
		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 4; x++) {
				System.out.println("wie oft?");
			}
		//
			System.out.println("wie oft hier nach?" + i);
		}
	}

}
