package java_study.day1;

public class Star {
	public void star1(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void star2(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = num - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void star3(int num) {
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i % num == 0) {
					System.out.print("*");
				} else if (j % num == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void star4(int num) {
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i % num == 0) {
					System.out.print("*");
				} else if (j % num == 0) {
					System.out.print("*");
				} else if (i == j || num - j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
