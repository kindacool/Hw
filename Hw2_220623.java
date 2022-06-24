package p2022_06_23;

public class Hw2 {

	public static void main(String[] args) {

		/*
		 * 구구단(2~9단)을 열방향(세로방향)으로 출력하는 프로그램을 작성 하세요?
		 */

		for (int i = 0; i <= 9; i++) {

			System.out.println();

			for (int dan = 2; dan <= 9; dan++) {
				if (i == 0) {
					System.out.print(" [" + dan + "단]\t\t");

				} else {
					System.out.print(dan + " * " + i + " = " + dan * i + "\t");
				}
			}

		}

	}

}
