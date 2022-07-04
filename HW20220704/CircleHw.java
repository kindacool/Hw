package p2022_07_04;

import java.text.DecimalFormat;

public class CircleHw {

	public static void main(String[] args) {

		// 반지름
		int r = 5;

		// 파이값
		final double pi = Math.PI;

		// 원주
		double n1 = 2 * pi * r;
		// 원의 면적
		double n2 = pi * Math.pow(r, 2);
		// 구의 표면적
		double n3 = 4 * pi * Math.pow(r, 2);
		// 구의 부피
		double n4 = ((double)4 / 3) * pi * Math.pow(r, 3);

		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("원주 : " + df.format(n1));
		System.out.println("원의 면적 : " + df.format(n2));
		System.out.println("구의 표면적 : " +df.format(n3));
		System.out.println("구의 부피 : " + df.format(n4));
		
//		System.out.printf("구의 부피 : " + "%.2f\n", n4); //도 가능하다
		

	}
}
