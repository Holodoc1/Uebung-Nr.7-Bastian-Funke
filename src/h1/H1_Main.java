package h1;

public class H1_Main {

	public static void main(String[] args) {
		Zahl zahl = new Zahl();
		zahl.num = -51;
		zahl.setEven();
		zahl.setSmall();
		zahl.setPositive();
		System.out.println("Zahl: " + zahl.num);
		System.out.println("Gerade: " + zahl.even);
		System.out.println("Klein: " + zahl.small);
		System.out.println("Positiv: " + zahl.positive);
	}
	
}
