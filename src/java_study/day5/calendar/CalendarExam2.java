package java_study.day5.calendar;

import java.util.Calendar;

public class CalendarExam2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), 1);
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		String[] yoil = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for (int i = 1; i < lastDay + startDay; i++) {
			if (i < startDay) {
				System.out.print("\t");
				continue;
			}
			System.out.print((i - startDay + 1) + "\t");
			if (i % 7 == 0) {
				System.out.println();
			}
		}
	}

}
