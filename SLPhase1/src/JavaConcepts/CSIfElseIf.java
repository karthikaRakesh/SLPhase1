package JavaConcepts;

public class CSIfElseIf {

	public static void main(String[] args) {
		int marks =78;
		if(marks>90) {
			System.out.println("Passed with High Grade");
		}else if(marks>80)
		{
			System.out.println("Grade S");
		}else if(marks>70 && marks<80) {
			System.out.println("Grade B");
		}else if(marks>60) {
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Failed");
		}

	}

}
