package sorting;

import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// https://www.youtube.com/watch?v=0lOnnd50cGI
		Random rand = new Random();
		int[] numbers = new int[10];
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = rand.nextInt(100);
		}
			
			System.out.println("Before Sorting");
			printArray(numbers);
			
			insertionsort(numbers);
			
			System.out.println("\n"  +"After Sorting");
			printArray(numbers);
		

	}

	private static void insertionsort(int[] numbers) {
		// TODO Auto-generated method stub
		for(int i = 1; i<numbers.length; i++) {
			int temp =  numbers[i];
			int j = i-1;
			while(j>=0 && numbers[j] > temp) {
				numbers[j+1] = numbers[j];
				j--;
			}
			numbers[j+1] = temp;
		}
		
		
	}

	private static void printArray(int[] numbers) {
		for(int i= 0;i<numbers.length;i++) {
			System.out.print(" " +numbers[i]);
		}
		
	}

}
