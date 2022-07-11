package p2022_07_11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeThreadHw extends Thread {

	@Override
	public void run() {

		while (true) {
			Date d = new Date();
			SimpleDateFormat dd = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
			System.out.println(dd.format(d));

			try {
				sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println(ie.toString());
			}

		}
	}

	public static void main(String[] args) {

		TimeThreadHw tth = new TimeThreadHw();
		tth.start();

	}

}
