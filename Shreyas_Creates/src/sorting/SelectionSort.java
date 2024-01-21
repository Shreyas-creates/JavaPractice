package sorting;

import java.util.Random;

public class SelectionSort {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		Random rand = new Random();
		for(int i = 0; i < numbers.length ; i++) {
			numbers[i] = rand.nextInt(100);
		}
		
		System.out.println("Before Sorting");
		printArray(numbers);
		
		insertionSort(numbers);
		
		System.out.println("\n" + "After Sorting");
		printArray(numbers);
	}

	private static void insertionSort(int[] numbers) {
		// TODO Auto-generated method stub
		int length =  numbers.length;
		for(int i = 0 ; i< length - 1 ; i++) {
			int min = numbers[i];
			int indexOfMin = i;
			for(int j = i+1; j<length ; j++) {
				if(numbers[j]< min) {
					min = numbers[j];
					indexOfMin = j;
				}
				
				
			}
			int temp = numbers[i];
			numbers[i] = numbers[indexOfMin];
			numbers[indexOfMin] = temp;
		}
	}

	private static void printArray(int[] numbers) {
		// TODO Auto-generated method stub
		for(int i = 0; i < numbers.length ; i++) {
			System.out.print(" " + numbers[i]);
		}
		
	}
}
