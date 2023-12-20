package javaPackage;

public class Addition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=0;
		int sum=a+b;
		int sub=b-a;
		int divide=b/a;
		int multply=a*b;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(divide);
		System.out.println(multply);
		
		for (sum=1;sum<6;sum++) {
			System.out.println(sum);
		}
		
		if (sub>3) {
			System.out.println("sub is greater than 2");
		}
		else {
			System.out.println("sub is less than 2");
		}
	}

}
