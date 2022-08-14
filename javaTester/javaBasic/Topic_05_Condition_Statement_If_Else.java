package javaBasic;

import java.util.Scanner;

public class Topic_05_Condition_Statement_If_Else {

	public static void Exercise_01() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("n là số chẵn");
		} else {
			System.out.println("n là số lẻ");
		}
	}

	public static void Exercise_02() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a >= b) {
			System.out.println("a lớn hơn hoặc bằng b");
		} else {
			System.out.println("a nhỏ hơn hoặc bằng b");
		}
	}

	public static void Exercise_03() {
		Scanner sc = new Scanner(System.in);
		String person1 = sc.nextLine();
		String person2 = sc.nextLine();
		if (person1.equals(person2)) {
			System.out.println("Hai người cùng tên ");
		} else {
			System.out.println("Hai người khác tên");
		}
	}

	public static void Exercise_04() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a >= b && a >= c) {
			System.out.print(a);
		} else if (b >= c) {
			System.out.print(b);
		} else {
			System.out.print(c);
		}
	}

	public static void Exercise_05() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a >= 10 && a <= 100) {
			System.out.print("a nằm trong [10,100]");
		} else {
			System.out.print("a không nằm trong [10,100]");
		}
	}

	public static void Exercise_06() {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		if (score > 0 && score < 5) {
			System.out.println("Điểm D");
		} else if (score > 5 && score < 7.5) {
			System.out.println("Điểm C");
		} else if (score > 7.5 && score < 8.5) {
			System.out.println("Điểm B");
		} else {
			System.out.println("Điểm A");
		}
	}

	public static void Exercise_07() {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.print("Month " + month + "th has 31 days.");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.print("Month " + month + "th has 30 days.");
		} else if (month == 2) {
			System.out.print("Month " + month + "th has 28 days.");
		}
	}

	public static void main(String[] args) {
		Exercise_07();
	}

}
