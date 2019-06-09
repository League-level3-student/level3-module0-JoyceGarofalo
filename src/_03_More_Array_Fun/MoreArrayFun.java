package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		stringArray(args);
		System.out.println("");
		reverseArray(args);
		System.out.println("");
		skipArray(args);
		System.out.println("");
		randArray(args);
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void stringArray(String[] str) {
		String[] strings = new String[10];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = new String("string:"+i);
			System.out.println(strings[i]);
		}
		
		
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void reverseArray(String[] rev) {
		String[] strings = new String[10];
		for (int i = 9; i < strings.length; i--) {
			strings[i] = new String("string:"+i);
			System.out.println(strings[i]);
			if(i==0) {
				break;
			}
		}
		
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void skipArray(String[] skip) {
		String[] strings = new String[10];
		for (int i = 0; i < strings.length; i+=2) {
			strings[i] = new String("string:"+i);
			System.out.println(strings[i]);
		}
	}
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	public static void randArray(String[] ra) {
		String[] strings = new String[10];
		Random rand = new Random();
		for (int i = 0; i < strings.length; i++) {
			int r = rand.nextInt(9);
			strings[i] = new String("string:"+r);
			System.out.println(strings[i]);
			
		}
		
	}
	
	
	
}
