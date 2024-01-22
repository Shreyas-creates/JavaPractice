package InterviewQuestionsStrings;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String first = "Shreyas";
			String second = "Gour";
			
			first =  first + second;
			System.out.println(first);
			
			second = first.substring(0,first.length()-second.length());
			first = first.substring(second.length());
			
			System.out.println(first);
			System.out.println(second);
			
			
	}

}
