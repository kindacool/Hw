package p2022_07_05;

import java.util.Scanner;

public class LeapYearHw {

	public static void main(String[] args) {

//	       키보드를 통해서 연도(ex) 2020)를  입력 받는다.
//	       이때 입력 받은 연도가 윤년인지 평년인지를 판별하는 
//	       프로그램을 작성하세요?

		System.out.println("연도를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean isLeapYear = false; // true면 윤년, false면 평년

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			isLeapYear = true;
		}

		if (isLeapYear == true) {
			System.out.println("윤년 입니다.");
		} else {
			System.out.println("평년 입니다.");
		}
	}

}
