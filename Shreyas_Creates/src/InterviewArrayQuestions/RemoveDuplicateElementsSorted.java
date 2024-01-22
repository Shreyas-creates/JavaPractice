package InterviewArrayQuestions;

//import java.util.Arrays;

public class RemoveDuplicateElementsSorted {

	public static void main(String[] args) {
		int[] arr = {1,5,6,6,8,8,77,79,79,80};
		int len = arr.length;
		int[] temp = new int[arr.length];
		int j =0;
		
		
		for(int i =0; i<len - 1; i++) {
			System.out.print(" Iteration " +i + "\n");
			if(arr[i] != arr[i+1]) {
				temp[j] = arr[i];
				j++;
			}
			
			
			
		}
		temp[j] = arr[len - 1];
		j++;
		
		
		for(int k = 0 ; k<j; k++) {
			System.out.print("  "  + temp[k]);
		}

	}

}
