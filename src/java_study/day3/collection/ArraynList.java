package java_study.day3.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraynList {
	public static void main(String[] args) {
		int kor, eng, math, total;
		double avg;
		String[] names = {"±èÀ¯´Ù", "±èÀ¯Çö", "¹Ú¹Î¾Æ", "Á¤¾Ö¸®"};
		int[] kors = {96, 100, 67, 84};
		int[] engs = {98, 100, 82, 55};
		int[] maths = {88, 89, 30, 20};
		List<Object> arr = new ArrayList<Object>();
		
		for(int i = 0; i < names.length; i++) {
			arr.add(names[i]);
			arr.add(kors[i]);
			arr.add(engs[i]);
			arr.add(maths[i]);
		}
		
		System.out.println("ÀÌ¸§\t±¹¾î\t¿µ¾î\t¼öÇÐ\tÃÑÁ¡\tÆò±Õ");
		Iterator iterator = arr.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
			Object obj = iterator.next();
			kor = (Integer)obj;
			eng = ((Integer) iterator.next()).intValue();
			math = (Integer) iterator.next();
			total = kor + eng + math;
			avg = (double) total / 3;
			System.out.println(kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg);
		}
	}
	
}