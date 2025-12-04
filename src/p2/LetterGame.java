package p2;

public class LetterGame {
	String keyString = "FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER DURCH BAYERN";
	String word = "";
	int[] a1 = new int[0];
	
	public void setWord(int[] a) {
		int i;
		for(i = 0; i < a.length; i++) {
			word += keyString.charAt(a[i]);
		}
	}
	public void findCode(String s) {
		a1 = new int[s.length()];
		int i;
		for(i = 0; i < s.length(); i++) {
			if(keyString.indexOf(s.charAt(i)) != -1) a1[i] = keyString.indexOf(s.charAt(i));
		}
	}
}
