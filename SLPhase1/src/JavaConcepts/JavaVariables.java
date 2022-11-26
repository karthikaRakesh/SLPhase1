package JavaConcepts;

public class JavaVariables {

	int i = 9;// instance variable:iside the class and outside the method
	static String s = "Learning JAVA";// static variable:variable declared with static keyword
	int[] arr = { 2, 5, 7, 9 };
	char c='s';
	float f=4.56f;
	double d=456.785d;
	boolean flag=true;

	int add(int a, int b) {// Local variables:Inside a method,method with argument a and b are arguments
		return a + b;

	}
	public void display() {//method without argument
		System.out.println("display is getting ready");//
	}

	public static void main(String[] args) {

		JavaVariables obj = new JavaVariables();// new :instantiating
		System.out.println(obj.add(2, 3));
		System.out.println(s);
		System.out.println(obj.i);
		obj.display();
	}

}
