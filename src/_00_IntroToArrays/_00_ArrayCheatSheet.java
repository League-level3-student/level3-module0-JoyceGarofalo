package _00_IntroToArrays;

import java.util.ArrayList;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strings = new String[5];
		//2. print the third element in the array
		System.out.println(strings[2]);
		//3. set the third element to a different value
		strings[2] = "string 2";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < strings.length; i++) {
			strings[i] = "string " + i;
			System.out.println(strings[i]);
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		//7. make an array of 50 integers
		Integer[] ints = new Integer[50];
		//8. use a for loop to make every value of the integer array a random number
		int small = 0;
		int big = 0;
		Random r = new Random();
		for (int i = 0; i < ints.length; i++) {
			int rr = r.nextInt(100);
			ints[i] = rr;
			if(ints[i] == 0) {
				small = ints[i];
			}
			else if(ints[i] < small) {
				small = ints[i];
			}
			if(ints[i] == 100) {
				big = ints[i];
			}
			else if(ints[i] > big) {
				big = ints[i];
			}
			System.out.println(ints[i]);
			
		}
		System.out.println(" ");
		System.out.println(small);
		System.out.println(big);
		System.out.println(ints[49]);
		
		
		
		//9. without printing the entire array, print only the smallest number on the array
		
		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
