package helloworld;

public class studentRegister {
	int studentId;
	String studentName;
	public studentRegister(int stu_id,String stu_name) {
		this.studentId=stu_id;
		this.studentName=stu_name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentRegister[] arr=new studentRegister[4];
		arr[0] = new studentRegister(1, "vara");
		arr[1] = new studentRegister(2, "prasad");
		arr[2] = new studentRegister(3, "naga");
		arr[3] = new studentRegister(4, "sri");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("studente name with student id " +
					arr[i].studentId + " is: " + arr[i].studentName);
		}

	}

}
