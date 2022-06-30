package p2022_06_30;

import java.util.Calendar;

public class CalendarHw {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH) + 1;
		int d = c.get(Calendar.DATE);
		int h2 = c.get(Calendar.HOUR_OF_DAY);
		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		int w = c.get(Calendar.DAY_OF_WEEK); // 일 : 1 ~ 토 : 7

		// 요일을 저장
		String[] week = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

		System.out.println(y + "." + m + "." + d + " " + h2 + ":" + mm + ":" + s + " " + week[w-1]);

	}

}
