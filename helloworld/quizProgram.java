package helloworld;

import java.util.Scanner;
public class quizProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("what is capital of India ?");
			System.out.println("1. Hyderabad\n2. Mumbai\n3. Delhi\n4. Pune\n5. 3exit");
			System.out.println("choose a option(1/2/3/4/5)");
			int num=sc.nextInt();
			if(num ==3) {
				System.out.println("congrats correct choice");
				break;
			}else if(num==5) {
				break;
			}else {
				System.out.println("wrong choice:enter correct choice");
			}
		}
	}

}
