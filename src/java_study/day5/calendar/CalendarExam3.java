package java_study.day5.calendar;

import java.util.Calendar;

public class CalendarExam3 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		
		System.out.println(year + "/" + month + "/" + date);
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String[] yoil = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(yoil[day] + "요일");
		
		boolean run = true;
		while(run) {
			try {
				cal = Calendar.getInstance();
				System.out.println(cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
