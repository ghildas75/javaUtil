package projetCollection;

public class Exercice1 {

	private int tab[];

	/*public Exercice1(int[] tab) {
		
		this.tab = tab;
	}*/
	
	public int  getNumPack(int tab[]) {
		
		int numPack=0;
		for (int i = 1; i < tab.length-1; i++) {
			if(tab[i-1]<tab[i]&& tab[i]>tab[i+1]) {
				numPack++;
			}
		
		}
		return numPack;
	}
	
}
