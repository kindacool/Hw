package p2022_06_23;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {

//		키보드를 이용해서 입력한 정수의 팩토리얼을
//		  구하는 프로그램을 작성 하세요?
//			ex) 3! = 3 * 2 * 1
//		        5! = 5 * 4 * 3 * 2 * 1
		int a; 
		int result = 1;
		// 입력받기
		System.out.println("정수를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		// 팩토리얼
		for (int i = a; i >= 1; i--) {
			result *= i;
		}

		// 출력
		System.out.println(a + "! = " + result);

	}

}
