package JavaConcepts;

public class ForLoop {

	public static void main(String[] args) {
		char[] ch= {'e','r','t','o','p'};
		for(int i=1;i<=10;i++)
		{
			System.out.println("The value of i: "+i);
		}
		for(char c:ch) {
			System.out.println(c);
			if(c=='t') {
				System.out.println("i have identified charecter t");
				break;
			}
		}
		System.out.println("---------------------------------");
		for(int j=1;j<=ch.length;j++) {
			System.out.println(j);
			if(j=='t') {
				System.out.println("i have identified t");
				break;
			}
		}
	}
	
}
