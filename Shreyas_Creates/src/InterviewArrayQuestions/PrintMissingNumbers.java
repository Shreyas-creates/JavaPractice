package InterviewArrayQuestions;

public class PrintMissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1,2,4,6,8,10,12};
		
//		Question asked
//		Print missing numbers from above array as in
//		Print 3,5,6,7,9,11
		int counter = 1;
		//int i=0;
		for(int i = 0; i< array1.length ; i++) {
			if(array1[i] == counter)
			{
				counter++;
			}
			else {
				System.out.println(counter);
				counter++;
				i--;
			}
		}
	}

}
