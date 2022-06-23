package p2022_06_22;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {

		int n1, n2, n3, max, min;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		// 내 풀이
		max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
		min = (n1 < n2) ? ((n1 < n3) ? n1 : n3) : ((n2 < n3) ? n2 : n3);
		System.out.println("max = " + max);
		System.out.println("min = " + min);

		// 다른 방법으로 풀기
		max = (n1 > n2 && n1 > n3) ? (n1) : ((n2 > n3) ? n2 : n3);
		min = (n1 < n2 && n1 < n3) ? (n1) : ((n2 < n3) ? n2 : n3);
		System.out.println(max);
		System.out.println(min);

		// 강사님 풀이
		max = (n1 > n2) ? n1 : n2;
		max = (max > n3) ? max : n3;

		min = (n1 < n2) ? n1 : n2;
		min = (min < n3) ? min : n3;
		System.out.println(max);
		System.out.println(min);

		sc.close();
	
	}

}
