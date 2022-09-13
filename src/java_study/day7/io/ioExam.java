package java_study.day7.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import java_study.day2.object.Ex2;

public class ioExam {
	List<Ex2> members;
	
	public ioExam() {
		members = new ArrayList<Ex2>();
		Ex2 member = new Ex2("김유현", "hyun", "password");
//		members.add(member);
//		fileInput(member);
		fileOutput();
		for (Ex2 m : members) {
			System.out.println(m.getName());
		}
		
	}
	
	public void fileInput(Ex2 member) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(new File("src/java_study/day7/io/members.txt"), true));			
			
			StringBuilder sb = new StringBuilder();
			sb.append(member.getName());
			sb.append("#");
			sb.append(member.getId());
			sb.append("#");
			sb.append(member.getPw());
			pw.println(sb.toString());

//			pw.println(member.getName() + "#" + member.getId() + "#" + member.getPw());
			
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fileOutput() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("src/java_study/day7/io/members.txt")));
			while(br.ready()) {
				StringTokenizer st = new StringTokenizer(br.readLine(), "#");
				while(st.hasMoreTokens()) {
//					String s = st.nextToken();
					Ex2 member = new Ex2(st.nextToken(), st.nextToken(), st.nextToken());
					members.add(member);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ioExam();
	}

}
