package projetCollection;
import java.util.*;

public class CompareArrayLinklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		List<Integer> list=new ArrayList<>();
		List<Integer> linkedlist=new LinkedList<>();
		doTiming("list", list);
		doTiming("linkedList",linkedlist);
		
	}

	/**
	 * @param type
	 * @param list
	 */
	private static void  doTiming(String type,List<Integer> list) {
		
	for(int i=0; i<1e5;i++) {
		 
		list.add(i);
	}
	long startTime= System.currentTimeMillis();
	
	for(int i=0; i<1e5;i++) {
		 
		list.get(i);
	}
	long endTime= System.currentTimeMillis();
	
	System.out.println("time taken "+(endTime-startTime)+" ms for "+type);
	}
}
