package java_study.day1;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("* * * * YD고등학교 * * * *");
		
		while(run) {
			System.out.println("\n---------------------------------------------------------------------------");
			System.out.println("1. 학생 수 입력 | 2. 점수 입력 | 3. 전체 점수 확인 | 4. 점수 분석 | 0. 종료");
			System.out.println("---------------------------------------------------------------------------");
			System.out.print("메뉴 선택 > ");
			int select = scanner.nextInt();
			
			if (select == 1) {
				System.out.print("학생 수 입력 > ");
				studentNum = scanner.nextInt();
				if (studentNum <= 0) {
					System.out.println("학생 수는 0명보다 많아야 합니다.");
					studentNum = 0;
				} else {
					scores = new int[studentNum];
					System.out.println("학생 수가 입력되었습니다.");
				}
			} else if (select == 2) {
				if (studentNum == 0) {
					System.out.println("학생 수가 입력되지 않아 점수를 입력할 수 없습니다.");
				} else {
					for(int i = 0; i < studentNum; i++) {
						System.out.print((i + 1) + "번 학생 점수 입력 > ");
						scores[i] = scanner.nextInt();
					}
				}
			} else if (select == 3) {

				if (studentNum == 0) {
					System.out.println("학생 수가 입력되지 않아 점수를 확인할 수 없습니다.");
				} else {
					for(int i = 0; i < studentNum; i++) {
					System.out.print((i + 1) + "번 학생 점수: " + scores[i]);
					}
				}
			} else if (select == 4) {
				if (studentNum == 0) {
					System.out.println("학생 수가 입력되지 않아 점수를 분석할 수 없습니다.");
				} else {
					int max = 0;
					int sum = 0;
					double avg = 0;
					for(int score : scores) {
						max = max < score ? score : max;
						sum += score;
					}
					avg = sum / studentNum;
					System.out.println("최고 점수: " + max);
					System.out.println("점수 합계: " + sum);
					System.out.println("평균 점수: " + avg);
				}
			} else if(select == 0) {
				System.out.println("YD고등학교 점수 시스템을 종료합니다.");
				run = false;
			} else {
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
		}
	}

}
