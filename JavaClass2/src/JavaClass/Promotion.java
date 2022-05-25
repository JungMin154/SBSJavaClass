package JavaClass;

class Person{
	public static void main (String[] args) {
		simpleOpr(7,3);
	}
	
	public static void simpleOpr (int n1,int n2) {
		System.out.println("더하기 :"+(n1+n2));
		System.out.println("빼기 :"+(n1-n2));
		System.out.println("곱하기 :"+(n1*n2));
		System.out.println("나누기의 몫 :"+(n1/n2));
		System.out.println("나누기의 나머지"+(n1%n2));
	}
}