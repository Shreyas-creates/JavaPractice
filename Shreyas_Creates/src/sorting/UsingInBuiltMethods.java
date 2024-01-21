package sorting;

import java.util.Arrays;
import java.util.Random;

public class UsingInBuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		int[] array1 = new int[10];
		for(int i=0; i<array1.length ; i++) {
			array1[i] = rand.nextInt(100);
		}
		
		System.out.println("Before Sorting");
		System.out.print(Arrays.toString(array1));
		
		Arrays.sort(array1);  //method to sort array
		
		System.out.println("\n" + "After Sorting");
		System.out.print(Arrays.toString(array1));
	}

}
