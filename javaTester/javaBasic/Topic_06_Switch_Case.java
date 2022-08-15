package javaBasic;

import java.util.Scanner;

public class Topic_06_Switch_Case {

	public static void Exercise_01() {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng này có 31 ngày");
			break;
		case 2:
			System.out.println("Tháng này có 28 ngày");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng này có 30 ngày");
			break;
		default:
			System.out.println("Vui lòng nhập tháng trong khoảng 1-12");
			break;
		}
	}
	
	public static void Exercise_02() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		switch (number) {
		case 1: 
			System.out.println("One");
			break;
		case 2: 
			System.out.println("Two");
			break;
		case 3: 
			System.out.println("Three");
			break;
		case 4: 
			System.out.println("Four");
			break;
		case 5: 
			System.out.println("Five");
			break;
		}
	}
	
	public static void Exercise_03() {
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		String operator = sc.next();
		
		switch(operator) {
		case "+":
			System.out.println(firstNumber + secondNumber);
			break;
		case "-":
			System.out.println(firstNumber - secondNumber);
			break;
		case "*":
			System.out.println(firstNumber * secondNumber);
			break;
		case "/":
			System.out.println(firstNumber / secondNumber);
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise_03();
	}

}
