package helloworld;



public class callByValue {
	
	int v=500;
	void change(int v) {
		v=v+100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callByValue cd=new callByValue();
		System.out.println(cd.v);
		cd.change(500);
		System.out.println(cd.v);
	}

}
