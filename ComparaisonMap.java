package projetCollection;
import java.util.*;

public class ComparaisonMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> hash=new HashMap<>();
		Map<Integer, String> hashLink=new LinkedHashMap<>();
		Map<Integer, String> treeMap=new TreeMap<>();
		
		comparer(hash);
		System.out.println("hashlink sauvegarde l'ordre des entree des donne");
		comparer(hashLink);
		System.out.println("treeMap prend plus de temps organise ");
		comparer(treeMap);
	}

	private static void comparer(Map<Integer,String> map) {
	
		map.put(2, "two");
		map.put(5, "five");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(7, "seven");
		map.put(5, "cinq");
		map.put(14, "eleven");
		
		for (Integer key: map.keySet()) {
			System.out.println("key"+ key +": "+map.get(key));
		}
	}
	
	
}
