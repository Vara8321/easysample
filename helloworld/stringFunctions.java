package helloworld;

public class stringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="string function program";
		String s2="string function";
		
		System.out.println("single string functions");
		
		System.out.println(s1.charAt(3));
		System.out.println(s1.codePointAt(3));
		System.out.println(s1.codePointBefore(4));
		System.out.println(s1.codePointCount(0, 5));
		
		System.out.println("string compare functions");
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		System.out.println("string concat functions");
		
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains(s2));
		System.out.println(s1.contains("s"));
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.contentEquals("string"));
		System.out.println(s1.endsWith("gram"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		

	}

}
