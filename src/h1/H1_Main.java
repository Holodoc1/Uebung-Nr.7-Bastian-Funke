package h1;

public class H1_Main {

	public static void main(String[] args) {
		int a = 201;
		Zahl zahl = new Zahl(a);
		System.out.println("Zahl: " + zahl.num);
		System.out.println("Gerade: " + zahl.even);
		System.out.println("Klein: " + zahl.small);
		System.out.println("Positiv: " + zahl.positive);
	}
	
}
