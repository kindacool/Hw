package p2022_07_01;

import java.util.Scanner;

public class JuminHw {
	public static void main(String[] args) {

		// 키보드로 주민번호 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 앞자리를 입력 하세요?");
		String jumin1 = sc.nextLine();

		System.out.println("주민번호 뒷자리를 입력 하세요?");
		String jumin2 = sc.nextLine();

		// 유효성 검사
		if (jumin1.length() != 6) {
			System.out.println("주민번호 앞자리 6자리를 입력하세요.");
		} else if (jumin2.length() != 7) {
			System.out.println("주민번호 뒷자리 7자리를 입력하세요.");
		} else if (!check(jumin1, jumin2)) {
			System.out.println("틀린 주민번호 입니다.");
		} else {
			System.out.println("올바른 주민번호 입니다.");
		}
	}

	static boolean check(String jumin1, String jumin2) {
		// 공식의 숫자들
		int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int total = 0;

		// 앞자리 처리
		for (int i = 0; i < jumin1.length(); i++) {
			String j = jumin1.substring(i, i + 1);
			total += a[i] * Integer.parseInt(j);
		}

		// 뒷자리 처리(마지막 숫자 빼기)
		for (int i = 0; i < jumin2.length() - 1; i++) {
			String j = jumin2.substring(i, i + 1);
			total += a[i + 6] * Integer.parseInt(j);
		}

		// 연산
		int total2 = total % 11;
		int total3 = 11 - total2;

		if (total3 >= 10) {
			total3 %= 10;
		}

		// 체크숫자와 같은지 확인
		if (total3 == Integer.parseInt(jumin2.substring(6, 7))) {
			return true;
		} else {
			return false;
		}
	}
}
