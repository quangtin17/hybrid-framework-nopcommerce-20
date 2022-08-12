package javaBasic;

import java.util.Scanner;

public class Topic_04_Operator {

	public static void Exercise_1() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		System.out.println("After 15 years, age of " + name + " will be " + (age + 15));
	}

	public static void Exercise_2() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping then a = " + a + " b = " + b);
	}

	public static void Exercise_3() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a > b);
	}

	public static void main(String[] args) {
		// Exercise_1();
//		Exercise_2();
		Exercise_3();
	}
}
