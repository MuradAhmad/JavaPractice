
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CodeTesting {

	// int number = 100;

	public static void main(String args[]) {
		/*
		 * // 1.
		 * 
		 * // Reverse a String with function
		 * 
		 * 
		 * String name = "murad"; StringBuilder str = new StringBuilder();
		 * str.append(name); str.reverse(); System.out.print(str);
		 * 
		 * // Reverse a String without function
		 * 
		 * int number = 0; char[] chr; chr = name.toCharArray();
		 * 
		 * for(int i= chr.length-1; i>=0; i--) { System.out.print(chr[i]); number =
		 * chr.length;
		 * 
		 * 
		 * 
		 * } System.out.print(number);
		 * 
		 */
		
		
		// 2.
		
		// Swapping without 3rd variable
		/*
		int x = 10;
		int y =20;
		x=x+y;
		y = x-y;
		x = x-y;
		System.out.println(y);
		*/
		
		// 3.
/*	
		// iterating HashMap using for Loop
		
		
		HashMap<Integer,String> map = new HashMap<Integer, String> ();
		
		map.put(1, "murad");
		map.put(2, "ahmad");
		map.put(3, "Latif");
		map.put(4, "mubeen");
		map.put(5, "murad");
		map.put(6, "mubeen");
		
		Iterator itr =  map.entrySet().iterator();
		
		
		ArrayList<String> data = new ArrayList<String>();
		
		
		
		
		
		
		while(itr.hasNext()) {
			
			Map.Entry me = (Map.Entry) itr.next();
			System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
			data.add((String)me.getValue());
				
		}
		
		HashSet<String> uniData = new HashSet<>(data); 
		System.out.println("Unique data Set value is: " + uniData );
		
	
		
		
		
		
		
		for (Map.Entry me2 : map.entrySet()) {

			System.out.println("Key is: " + me2.getKey() + " Value is: " + me2.getValue());
		}*/
		
		

		
// 4.
		// Fibonacci series
		
		
	/*	
		int number = 9;
		int current = 0;
		int next = 1;
		int previous = 0;
		
		for(int x =0; x<=number; x++ ) {
			current = previous;
			previous = next;
			next = current + previous;
			System.out.println(current);
		}
	*/
		
	/*	// 5.
		// iterate ArrayList using for-loop, while-loop, and advance for-loop
		
		ArrayList <String> names = new ArrayList<String>();
		
		names.add("murad");
		names.add("ahmad");
		names.add("khan");
		names.add("jalal");
		
		Iterator itr = names.iterator();
		
		System.out.println("While loop\n");
		while(itr.hasNext()) {
			System.out.println(itr.next());	
		}
		
		System.out.println("\nFor loop\n");
		for(int x =0; x< names.size(); x++) {
			System.out.println(names.get(x));
		}
		
		System.out.println("\nAdvance For loop\n");
		for(String str: names) {
			System.out.println(str);
			
		}
		*/
		/*
		// 6. Write a Java Program to find the duplicate characters in a string.
		ArrayList <String> duplicates = new ArrayList<String>();
		String str = "aaabaccccacdeee";
		
		char [] ch = str.toCharArray();
		int count =0;
		for(int i = 0; i< str.length(); i++) {
			for(int j = i+1; j< str.length(); j++) {
				if(ch[i]==ch[j]) {
					char dup = ch[j];
					String s=Character.toString(dup);
					
					duplicates.add(s);
				
					System.out.println("Duplicates:\n" + ch[j]);
					count++;
					break;
					
				}
				
				
			}
	
			
		}
		
		System.out.println(count);*/
		
		/*// 7. find the second highest number in an array.
		
		int [] numbers = {4,6,9,11,45,75,54, 44, 33 };
		int highest = 0;
		int secHigh =0;
		
		for(int i =0; i< numbers.length; i++) {
			
			if(numbers[i]> highest) {
				
				secHigh = highest;
				highest = numbers[i];
			}
			else if(numbers[i]> secHigh) {
				secHigh = numbers[i];
				
			}
		}
		System.out.println(highest);

		System.out.println(secHigh);
		
		*/
/*		
		// 8. remove duplicate number in an array.
		
				int [] numbers = {4,4, 9, 3, 6,9,1,7,5,5,5, 3 };
				HashSet <Integer> unique = new HashSet<Integer>();
				
				
				
				for(int i =0; i< numbers.length; i++) {
					unique.add(numbers[i]);	
					
				}
				System.out.println(unique);
				*/
		
		// 8. return first non repeating string or char in an array.
		
		/*
		String str = "aaaabcccddddeee";
		char[] ch = str.toCharArray();
		
		for (int i = 0; i< str.length(); i++) {
			
		}
		
		*/
				
				
		
	
	}

}
