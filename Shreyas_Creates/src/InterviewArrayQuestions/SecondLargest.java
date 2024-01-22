package InterviewArrayQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SecondLargest {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array1 = new int[20];
		for(int i = 0 ;i <array1.length;i++) {
			array1[i]  = rand.nextInt(100);
		}
		
		
		System.out.println("This is the Array " + Arrays.toString(array1));
		
		
		Arrays.sort(array1);
		System.out.println("Hellp");
		
		
		
		System.out.println("This is the Decen sorted " + Arrays.toString(array1));
		
		System.out.println("Second Largest Element is: " + array1[18]);
	}

}
