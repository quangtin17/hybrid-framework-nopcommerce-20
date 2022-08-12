package javaBasic;

public class Topic_02_Data_Type {

	public static void Exercise_1() {
		int a = 6;
		int b = 2;
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));

	}

	public static void Exercise_2() {
		double length = 7.5;
		double width = 3.8;
		System.out.println("Area = " + (length * width));
	}

	public static void Exercise_3() {
		String name = "Automation Testing";
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
		Exercise_1();
		Exercise_2();
		Exercise_3();
	}

}
