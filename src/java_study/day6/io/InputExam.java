package java_study.day6.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputExam {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/Dev/java_study/src/java_study/day6/io/text.txt");
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		PrintWriter printWriter = new PrintWriter(bufferedWriter, true);
		InputStream inputStream = System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("입력 > ");
		String str = "";
		while(!inputStreamReader.equals("end")) {
			str = bufferedReader.readLine();
			printWriter.println(str);
		}
		bufferedReader.close();
		printWriter.close();
	}
}
