package projetCollection;
import java.util.*;
public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Set<String> set1= new HashSet<String>();
		Set<String> setY= new LinkedHashSet<String>();
		Set<String> set=new TreeSet<String>();
		set1.add("dog");
		set1.add("cat");
		set1.add("fox");
		set1.add("cow");
		set1.add("snake");
		//adding duplicate item
		set1.add("cat");
	    
		System.out.println(set1.contains("CAT"));
		
		/*for (String item : set1) {
			
			System.out.println(item);
			
		}*/
		
		//Intersection des deux set
		
		Set<String> set2= new HashSet<String>();
		set2.add("monkey");
		set2.add("girrafe");
		set2.add("dog");
		set2.add("butterfly");
		set2.add("cat");
		
		Set<String> Intersection= new HashSet<String>(set1);
		Intersection.retainAll(set2);
		//System.out.println(Intersection);
		
		//Differnce des deux set
		Set<String> diff= new HashSet<String>(set1);
		diff.removeAll(set2);
		System.out.println(diff);
		
	}

}
