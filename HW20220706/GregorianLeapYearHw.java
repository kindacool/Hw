package p2022_07_06;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class GregorianLeapYearHw {

	public static void main(String[] args) {

		// 입력
		System.out.println("연도를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		// 객체 생성
		GregorianCalendar gc = new GregorianCalendar();
		
		if(gc.isLeapYear(year)) {
			System.out.println("윤년 입니다.");
		}else {
			System.out.println("평년 입니다.");
		}
	}

}
