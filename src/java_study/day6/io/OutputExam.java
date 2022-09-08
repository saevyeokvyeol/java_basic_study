package java_study.day6.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class OutputExam {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/Dev/java_study/src/java_study/day6/io/text.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while (bufferedReader.ready()) {
			System.out.println(bufferedReader.readLine());
		}
		bufferedReader.close();
	}
}
