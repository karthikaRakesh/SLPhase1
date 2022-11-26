package JavaConcepts;

public class ControlStatementIfElse {
	int a=43;
	
	int mul(int i,int j) {
		return i*j;
	}

	public static void main(String[] args) {
		ControlStatementIfElse obj=new ControlStatementIfElse();
		int result=obj.mul(6, 3);
		if(result>10) {
			System.out.println("Condition satisfied and the Output is:"+result);
		}else {
			System.out.println("Condition not satisfied");
			
		}
	}

}
