package p2022_06_24;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
//		과제.
//	       키보드를 이용해서 정수 5개를 입력 받은후 int형
//	       배열에 저장한다. 이때 배열에 저장된 값중에서
//	       최대값과 최소값을 구하는 프로그램을 작성하세요?

		int[] numbers = new int[5];
		Scanner sc = new Scanner(System.in);
		int max, min;

		// 키보드로 입력받기
		System.out.println("정수 5개를 입력하세요?");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}

		max = numbers[0];
		min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > max)
				max = numbers[i]; // 최대값 구하기
			if (numbers[i] < min)
				min = numbers[i]; // 최소값 구하기
		}
		
		//출력
		System.out.println("max = " + max);
		System.out.println("min = " + min);

	}

}
