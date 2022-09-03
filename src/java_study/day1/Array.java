package java_study.day1;

import java.util.Arrays;

public class Array {
	public void maxNum(int num) {
		int[] numArr = new int[num];
		for (int i = 0; i < num; i++) {
			numArr[i] = (int) (Math.random() * 21);
		}
		int max = 0;
		int min = 21;
		for (int n:numArr) {
			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
		}
		System.out.println(Arrays.toString(numArr));
		System.out.println("min number = " + min);
		System.out.println("max number = " + max);
	}
}
