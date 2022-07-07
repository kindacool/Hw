package p2022_07_07;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetLottoHw {

	public static void main(String[] args) {

		TreeSet lotto = new TreeSet();
		Random r = new Random();

		while (lotto.size() < 6) {
			lotto.add(r.nextInt(45) + 1);
		}

		System.out.println("로또 번호 : " + lotto);

	}

}
