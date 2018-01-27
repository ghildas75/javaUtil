package projetCollection;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashMap<Integer,String > map= new HashMap<>();
	
	map.put(2, "two");
	map.put(5, "five");
	map.put(8, "eight");
	map.put(9, "nine");
	map.put(7, "seven");
	map.put(5, "cinq");
	map.put(14, "eleven");
	//System.out.println(map.get(5));
	for(Map.Entry<Integer, String> entry :map.entrySet()) {
		System.out.println(entry);
	
	}

}
}