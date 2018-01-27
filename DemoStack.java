package projetCollection;
import java.util.*;

public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	ArrayList<Integer> list= new ArrayList<>();
	list.add(10);
	list.add(9);
	list.add(7);
	list.add(11);
	list.add(12);
	list.add(1);
	
	 
//	int taille=list.size();
//	
//	for (Integer item : list) {
//		System.out.print(item+"\t");
//	}
//	System.out.println();
////	Collections.reverse(list)
//	for (int i = 0; i <(taille/2); i++) {
//		
//		
////		
////		int tmp=list.get(i);
////	     tmp= list.get((taille-1)-i);
//	    int temps=list.get(i);
//	    int last=list.get( (taille-i)-1);
//		list.set(i,last );
//		list.set((taille-i)-1, temps);
////        arr[i] = arr[len-i-1];
////        arr[len-i-1] = tmp;
////		
//     
//		
//			
//			
//	}	
//	
//	for (Integer item : list) {
//		System.out.print(item+"\t");
//	}
		Stack<String> stack= new Stack<String>();
		stack.push("samir");
		printStack(stack);
		stack.push("jennifer");
		printStack(stack);
		stack.push("nathalie");
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		
	}

	private static void printStack(Stack<String> stack) {
		// TODO Auto-generated method stub
		if(stack.isEmpty())
			System.out.println("its empty");
		else
			System.out.printf("%s TOP\n",stack);
	}

}
