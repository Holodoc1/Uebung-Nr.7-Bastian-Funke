package p1;

public class P1_Main {

	public static void main(String[] args) {
		int z1 = 5;
		int n1 = 2;
		int z2 = 3;
		int n2 = 4;
		Bruch a = new Bruch(z1,n1);
		Bruch b = new Bruch(z2,n2);
		multFrac(z1, n1, z2, n2);
		System.out.println(b);
		multFrac(a,b);
	}
	
	public static void multFrac(int z1, int n1, int z2, int n2) {
		System.out.println(z1 * z2 + ":" + n1 * n2);
	}
	
	public static void multFrac(Bruch a, Bruch b) {
		Bruch ergebnis = new Bruch(a.z * b.z, a.n * b.n);
		System.out.println(ergebnis.toString());
	}
}
