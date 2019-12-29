import java.util.ArrayList;  
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

	private static long startTime = System.currentTimeMillis();
	static LinkedListClass LL = new LinkedListClass(); // call linked list class
	static ArrayList<Integer> store = new ArrayList<Integer>();

	public static void main(String[] args) {

		// set up scanner to receive input from user
		Scanner key = new Scanner(System.in);

		// get the number of integers from the user
		System.out.println("please enter number of integers: ");
		int n = key.nextInt();
		// get the minimum of the range from the user
		System.out.println("please enter the min: ");
		int min = key.nextInt();
		// get the maximum of the range from the user
		System.out.println("please enter the max: ");
		int max = key.nextInt();
		// call LinkedList method
		Random rand = new Random(); // create variable for random integer
		// Generate n random integers from 1 to m
		System.out.print("\n\nRandom numbers generated: ");
		int randomNum = 0;
		for (int i = 0; i < n; i++) {
			randomNum = rand.nextInt((max - min) + 1) + min;
			System.out.print(randomNum + " ");
			LL.add(randomNum); // store into linked list
			store.add(randomNum); // store into array

		}
		LinkedList(n, randomNum); // call method
		Array(n, randomNum); // call method

	}

	public static void LinkedList(int n, int randomNum) {
		System.out.println("\n\nLinked List");

		// initialize variables
		int i;
		int count = 0;

		for (i = 0; i < n; i++) {
			if (LL.get(i).equals(50)) {// check to see if "50" is in linked
										// list, count how many times "50"
										// occurs
				count++;
			}
		}

		// print recorded number of 50's
		System.out.print("\n\nNumber of 50's: " + count);

		// print results
		if (count > 5) {
			LL.sort(); // sort list in ascending order
			System.out.println("\n\nIn Ascending order: " + LL);
			LL.remove(i = 5); // remove 5th index
			System.out.println("\nList without 5th element: " + LL);
			LL.add(10); // add 10 to the list
			LL.sort(); // sort list in ascending order again
			System.out.println("\nList with 5th element removed and replaced with 10: " + LL);
		}
		// print results
		else {
			LL.sort(); // sort list ascending order
			LL.Reverse(); // reverse list so it displays descending order
			System.out.println("\n\nDescending order: " + LL);
			LL.remove(i = 2); // remove 2nd element
			System.out.println("\nList without 2nd element: " + LL);
			LL.add(10); // add 10 to the list
			LL.sort(); // sort list in ascending order
			LL.Reverse(); // reverse list so it displays descending order
			System.out.println("\nList with 2nd element removed and replaced with 10: " + LL);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("\nIt took " + (endTime - startTime) + " milliseconds");// 40
																					// number
																					// of
																					// steps
	}

	public static void Array(int n, int randomNum) {
		System.out.println("\nArray");

		// Initialize variables
		int i;
		int count = 0;

		System.out.print("\n\nRandom numbers generated: ");
		// Generate n random integers from 1 to m
		for (i = 0; i < n; i++) {

			// count how many times 50 occurs in the array list
			if (store.get(i) == 50) {
				count++; // increment count
			}
		}
		// sort array in ascending order if count is greater than 5
		if (count > 5) {
			Collections.sort(store);
		}
		// sort array in descending order if count is less than 5
		else {
			Collections.sort(store);
			Collections.reverse(store);
		}
		// print recorded number of 50's
		System.out.print("\n\nNumber of 50's: " + count);

		// print results
		if (count > 5) {

			System.out.println("\n\nIn Ascending order: " + store);

			store.remove(5); // remove fifth element

			System.out.println("\nList without 5th element: " + store);

			store.add(10);// add ten to the list
			Collections.sort(store); // sort list in ascending order

			System.out.println("\nList with 5th element removed and replaced with 10: " + store);

		}
		// print results
		else {

			System.out.println("\n\nDescending order: " + store);

			store.remove(2); // remove second element

			System.out.println("\nList without 2nd element: " + store);

			store.add(10); // add ten to the list
			Collections.sort(store); // sort list in ascending order
			Collections.reverse(store);// reverse the list to show in descending
										// order

			System.out.println("\nList with 2nd element removed and replaced with 10: " + store);

			long endTime = System.currentTimeMillis();
			System.out.println("\nIt took " + (endTime - startTime) + " milliseconds");// 42
																						// number
																						// of
																						// steps

		}

	}
}
