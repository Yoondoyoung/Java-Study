package days32;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Grade {

	public void printGrade(String fileName) throws Exception {
		// 구현
		String line = "";
		String name = "";
		String score = "";
		int count = 0;
		int sum = 0;
		int average = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader((new FileInputStream(fileName)), "UTF-8"));

		while (true) {
			line = bf.readLine();
			if (line == null) {
				break;
			}
			name = line.substring(0, line.indexOf(","));
			score = line.substring(line.indexOf(",") + 1, line.length());
			System.out.println(name + "의 점수는 " + score + "점 입니다.");
			count++;
			sum += Integer.parseInt(score);
		}
		average = sum/count;
		System.out.println("모두의 총점은 "+sum+"점 입니다.");
		System.out.println("모두의 평균은 "+average+"점 입니다.");
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Grade grade = new Grade();
		String fileName = "C:\\Users\\YOON\\eclipse-workspace\\practice\\JavaClass\\score.txt";
		grade.printGrade(fileName);
	}

}
