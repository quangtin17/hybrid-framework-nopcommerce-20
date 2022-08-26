package javaBasic;

import java.util.Scanner;

public class Topic_08_While_DoWhile {
	static Scanner sc = new Scanner(System.in);

	public static void Exercise_01() {
		int number = sc.nextInt();
		while (number < 100) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
			number++;
		}
	}

	public static void Exercise_02() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		while (a <= b) {
			if (a % 3 == 0 && a % 5 == 0) {
				System.out.println(a + " ");
			}
			a++;
		}
	}

	public static void Exercise_03() {
		int n = sc.nextInt();
		int sum = 0;
		while (n >= 0) {
			if (n % 2 != 0) {
				sum += n;

			}
			n--;
		}
		System.out.print(sum);
	}

	public static void Exercise_04() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		while (a <= b) {
			if (a % 3 == 0) {
				System.out.print(a + " ");
			}
			a++;
		}
	}

	public static void Exercise_05() {
		int n = sc.nextInt();
		int giaithua = 1;
		while (n > 0) {
			giaithua *= n;
			n--;
		}
		System.out.print(giaithua);
	}

	public static void Exercise_06() {
		int i = 1;
		int sum = 0;
		while (i >= 1 && i <= 10) {
			if (i % 2 == 0) {
				sum+= i;
				System.out.print(sum);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Exercise_06();
	}

}
