package p2;

public class P2_Main {

	public static void main(String[] args) {
		LetterGame spiel = new LetterGame();
		int[] a = {0,1,2,43};
		String s = "FRAU";
		spiel.findCode(s);
		int i;
		System.out.print("[" + spiel.a1[0]);
		for(i = 1; i < spiel.a1.length; i++){
			System.out.print("," + spiel.a1[i]);
		}
		System.out.print("]");
		System.out.println();
		spiel.setWord(spiel.a1);
		System.out.println(spiel.word);
	}	
}
