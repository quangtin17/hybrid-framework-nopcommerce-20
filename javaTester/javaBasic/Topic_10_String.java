package javaBasic;

import java.util.Scanner;

public class Topic_10_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String schoolName = "Automation Testing";
		String courseName = "automation testing";
		String schoolAddress = "Ho Chi Minh City";

		System.out.println("Độ dài = " + schoolName.length());
		System.out.println("Lấy ra 1 kí tự = " + schoolName.charAt(0));
		System.out.println("Nối 2 chuỗi = " + schoolName.concat(schoolAddress));
		System.out.println("Nối 2 chuỗi = " + schoolName + schoolAddress);

		//
		System.out.println("Kiểm tra 2 chuỗi bằng nhau tuyệt đối = " + schoolName.equals(courseName));
		System.out.println("Kiểm tra 2 chuỗi bằng nhau tuyệt đối = " + schoolName.equals("Automation Testing"));

		//
		System.out.println("Kiểm tra 2 chuỗi bằng nhau tương đối = " + schoolName.equalsIgnoreCase(courseName));

		// startsWith / endsWith / contains
		System.out.println("Có bắt đầu bằng 1 kí tự / chuỗi kí tự = " + schoolName.startsWith("A"));
		System.out.println("Có bắt đầu bằng 1 kí tự / chuỗi kí tự = " + schoolName.startsWith("Automation"));
		System.out.println("Có bắt đầu bằng 1 kí tự / chuỗi kí tự = " + schoolName.startsWith("T"));

		System.out.println("Có chứa 1 kí tự / chuỗi kí tự = " + schoolName.contains("Automation"));
		System.out.println("Có chứa 1 kí tự / chuỗi kí tự = " + schoolName.contains("T"));
		System.out.println("Có chứa 1 kí tự / chuỗi kí tự = " + schoolName.contains("Testings"));

		System.out.println("Có kết thúc bằng 1 kí tự / chuỗi kí tự = " + schoolName.endsWith("A"));
		System.out.println("Có kết thúc bằng 1 kí tự / chuỗi kí tự = " + schoolName.endsWith("g"));

		// index
		System.out.println("Vị trí của 1 kí tự / chuỗi kí tự trong chuỗi = " + schoolName.indexOf("Automation"));
		System.out.println("Vị trí của 1 kí tự / chuỗi kí tự trong chuỗi = " + schoolName.indexOf("n"));
		System.out.println("Vị trí của 1 kí tự / chuỗi kí tự trong chuỗi = " + schoolName.indexOf("Testing"));

		// substring
		System.out.println("Tách 1 kí tự / chuỗi kí tự trong chuỗi = " + schoolName.substring(11));
		System.out.println("Tách 1 kí tự / chuỗi kí tự trong chuỗi = " + schoolName.substring(11, 15));

		// Split : Tách chuỗi thành 1 mảng dựa vào kí tự / chuỗi kí tự
		String result = "View 48 of 132 results";
		String results[] = result.split(" ");
		System.out.println(results[1]);

		// Replace
		String productPrice = "$100.00";
		productPrice = productPrice.replace("$", "");
		System.out.println(productPrice);

		float productPriceF = Float.parseFloat(productPrice);
		System.out.println(productPriceF);

		// Exercise
		System.out.println(" ----------- Exercise ------------ ");
		Exercise_02();
	}

	Scanner sc = new Scanner(System.in);
	static String courseName = "Automation Testing Advanced";
	static String courseNames = "Automation Testing 345 Tutorials Online 789";

	public static void Exercise_01() {
		int answer = 0;
		char courseNameArr[] = courseName.toCharArray();
		for (char character : courseNameArr) {
			if (character >= 'A' && character <= 'Z') {
				answer++;
			}
		}
		System.out.println("Sum of uppercase = " + answer);
	}

	public static void Exercise_02() {
		int answer = 0;
		char courseNamesArrchar[] = courseNames.toCharArray();
		for (char character : courseNamesArrchar) {
			if (character == 'a' || character == 'A') {
				answer++;
			}
		}
		System.out.println("Số lượng ký tự a có trong chuỗi " + answer);
		
		String numberssChar[] = courseNames.split(" ");
		int count = 0;
		for (int i = 0; i < numberssChar.length; i++) {
			count++;
		}
		System.out.println(count);

		System.out.println("Kiểm tra chuỗi có chứ từ Testing hay không : " + courseNames.contains("Testing"));
		System.out.println("Kiểm tra chuỗi có bắt đầu bằng từ Automation hay không : " + courseNames.startsWith("Automation"));
		System.out.println("Kiểm tra chuỗi có kết thúc bằng từ Online hay không : " + courseNames.endsWith("Online"));
		System.out.println("Vị trí của 1 kí từ Tutorials trong chuỗi : " + courseNames.indexOf("Tutorials"));
		courseNames = courseNames.replace("Online", "Offline");
		System.out.println("Chuỗi sau khi đã thay thế : " + courseNames);
	}
}
