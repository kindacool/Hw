package p2022_06_27;

public class Hw2 {

	public static void main(String[] args) {

//	    2. 구구단(2~9단)의 연산 결과를 2차원 배열에 저장하고,
//	       배열에 저장된 결과를 이용해서 구구단을 출력하는 
//	       프로그램을 작성하세요?

		int[][] gugudan = new int[8][9];

		// 저장하기
		int r, c;
		for (r = 0; r < 8; r++) {
			for (c = 0; c < 9; c++) {
				gugudan[r][c] = (r+2)*(c+1);
			}
		}
		
		//출력하기
		for (r = 0; r < 8; r++) {
			for (c = 0; c < 9; c++) {
				System.out.print(gugudan[r][c] + "\t"); 
			}
			System.out.println();
		}

	}

}
