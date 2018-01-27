package projetCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestDrive {

	public static void main(String[] args) {
		int tab[]= {1, 2, 3, 2, 1, 3, 5, 2, 3, 1};
		Exercice1 Exy= new Exercice1();
		String tabs[]= {"tuples", "are", "awesome", "tuples", "are", "cool",
		                       "tuples", "tuples", "tuples", "shades"};
	
		Exercice2 ex= new Exercice2(tabs);
	    HashMap<String,Integer> map= ex.GetOccurence();
	    for(Map.Entry entry:map.entrySet()) {
	    	System.out.println( entry.getKey()+" "+entry.getValue());
	    }
		//System.out.println(Exy.getNumPack(tab));
		
	}
}
