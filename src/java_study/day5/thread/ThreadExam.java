package java_study.day5.thread;

public class ThreadExam {
	public static void main(String[] args) {
		Thread thread = new ThreadExam2();
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
