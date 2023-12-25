package helloworld;

public class variableArguments {
	
	static void display(String...values ) {
		System.out.println("display function is invoked");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		display("my", "name", "is", "java");
		

	}

}
