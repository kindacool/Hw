package p2022_06_28;

public class Hw1 {

	public static void main(String[] args) {
		/*
		 * 1~45사이의 숫자를 6개 추출 하는 프로그램을 작성 하세요? 
		 * (단, 중복된 숫자는 1번만 출력 되도록 한다.) 
		 * Math.random() 이용해서 프로그램을 작성 하세요.
		 */

		int[] random = new int[6];

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) { // 이전에 들어간 값과 같은 값이 있는지 검사
				if (random[i] == random[j]) { // 같은 값이 있다면
					i--; // 다시 할당하기 위해서 i--;
				}
			}
		}

		// 출력하기
		for (int i : random) {
			System.out.print(i + " ");
		}

	}

}
