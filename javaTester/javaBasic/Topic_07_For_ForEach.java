package javaBasic;

import java.util.Scanner;

public class Topic_07_For_ForEach {

	public static void Exercise_01() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}

	public static void Exercise_02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a : ");
		int a = sc.nextInt();
		System.out.println("Nhap b : ");
		int b = sc.nextInt();

		for (int i = a; i >= a && i <= b; i++) {
			System.out.print(i + " ");
		}
	}

	public static void Exercise_03() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.print(sum);
	}

	public static void Exercise_04() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a : ");
		int a = sc.nextInt();
		System.out.println("Nhap b : ");
		int b = sc.nextInt();
		int sum = 0;
		for (int i = a; i >= a && i <= b; i++) {
			sum += i;
		}
		System.out.print(sum);
	}
	
	public static void Exercise_05() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {

			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.print(sum);
	}
	
	public static void Exercise_06() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a : ");
		int a = sc.nextInt();
		System.out.println("Nhap b : ");
		int b = sc.nextInt();
		for (int i = a; i >= a && i <= b; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void Exercise_07() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n : ");
		int n = sc.nextInt();
		int answer = 1;
		for (int i = 1; i <= n; i++) {
			answer *= i;
		}
		System.out.print(answer);
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Exercise_07();
	}

}
