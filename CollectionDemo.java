package projetCollection;
import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<Integer> numbers= new ArrayList<>();
	numbers.add(5);
	numbers.add(3);
	numbers.add(9);
	numbers.add(1);
	
	Iterator<Integer> it=numbers.iterator();
	while (it.hasNext()) {
	
		System.out.print(it.next()+"\t");
	}
	for (int num : numbers) {
		System.out.println(num);
	}
	System.out.println();
	for (int i = 0; i < numbers.size(); i++) {
		System.out.println(numbers.get(i));
	}
	
	System.out.println();
	Collections.sort(numbers);
	for (int num : numbers) {
		System.out.println(num);
	}
	}

}
