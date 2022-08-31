package javaBasic;

public class Topic_09_Array {

	static int number[] = { 5, 8, 15, 7, 60, 100 };

	public static void Exercise_01() {
		int x = 0;
		for (int i = 0; i < number.length; i++) {
			if (x < number[i]) {
				x = number[i];
			}
		}
		System.out.print("Max number = " + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise_06();
	}

	public static void Exercise_02() {
		int sum = 0;

		sum = number[0] + number[number.length - 1];
		System.out.print(sum);
	}

	public static void Exercise_03() {
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				System.out.print(number[i] + " ");
			}
		}
	}

	public static void Exercise_04() {
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 != 0 && number[i] > 0) {
				sum += number[i];
			}
		}
		System.out.print(sum);
	}

	public static void Exercise_05() {
		for (int i = 0; i < number.length; i++) {
			if (number[i] >= 0 && number[i] <= 10) {
				System.out.print(number[i] + " ");
			}
		}
	}

	public static void Exercise_06() {
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		System.out.println(sum);
		System.out.println(sum / number.length);
	}

}
