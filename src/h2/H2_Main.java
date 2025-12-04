package h2;

import java.util.Arrays;

public class H2_Main {

	public static void main(String[] args) {
		int[] a = {2,7,1,9};
		int[] b = {2,7,1,9};
		int start = 3;
		int end = 2;
		int[] ausgabe = change(a,b,start,end);
		
		System.out.print("[");
		if(ausgabe.length > 0) {
			System.out.print(ausgabe[0]);
			int i;
			for(i = 1; i < ausgabe.length; i++) {
				System.out.print("," + ausgabe[i]);
			}
		}
		System.out.print("]");
	}
	
	public static int[] change(int[] a, int[] b, int start, int end) {
		int[] ergebnis = new int[0];
		if(a != null && b != null) {
			if(end > start && Arrays.compare(a,b) != 0) {
				if(a.length > 0) ergebnis = Arrays.copyOfRange(a,0,a.length);
			}else if(end > start && Arrays.compare(a,b) == 0) {
				Arrays.sort(a);
				ergebnis = Arrays.copyOfRange(a, start, end);
			}
		}
		return ergebnis;
	}
}
