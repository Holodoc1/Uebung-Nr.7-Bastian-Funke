package h3;

public class Mensch {
	String name = "Bastian";
	int gebJahr = 2007;
	int alter;
	
	
	
	public void setName(String pName) {
		name = pName;
	}
	
	public void setGebJahr(int pGebJahr) {
		gebJahr = pGebJahr;
	}
	
	public void setAlter() {
		alter = 2025 - gebJahr;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGebJahr() {
		return gebJahr;
	}
	
	public int getAlter() {
		return alter;
	}
}
