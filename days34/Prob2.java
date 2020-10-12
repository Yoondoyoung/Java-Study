package days34;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prob2 {
	
	//static method
	public static char checkGrade(double avg) {
		//구현
		if(avg>=90) {
			return 'A';
		}else if(avg>=80 | avg<90) {
			return'B';
		}
		else if(avg>=70 | avg<80) {
			return'C';
		}
		else if(avg>=60 | avg<70) {
			return'D';
		}else {
			return 'F';
		}
	}

	public static void main(String[] args) throws IOException {
		//Field
		String stdNum = "";
		int kor = 0;
		int math = 0;
		int eng = 0;
		int java = 0;
		int sum = 0;
		double avg = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("학번을 입력하세요 : ");
		stdNum = keyboard.nextLine();
		System.out.println("국어 성적을 입력하세요 : ");
		kor = keyboard.nextInt();
		System.out.println("수학 성적을 입력하세요 : ");
		math = keyboard.nextInt();
		System.out.println("영어 성적을 입력하세요 : ");
		eng = keyboard.nextInt();
		System.out.println("자바 성적을 입력하세요 : ");
		java = keyboard.nextInt();
		
		//구현
		sum = kor+math+eng+java;
		avg = (double)sum/4;
		BufferedWriter bf = new BufferedWriter(new FileWriter("grade.txt"));
		bf.write("-------------------");
		bf.newLine();
		bf.write("학번 : "+stdNum);
		bf.newLine();
		bf.write("-------------------");
		bf.newLine();
		bf.write("국어 : "+Integer.toString(kor));
		bf.newLine();
		bf.write("수학 : "+Integer.toString(math));
		bf.newLine();
		bf.write("영어 : "+Integer.toString(eng));
		bf.newLine();
		bf.write("자바 : "+Integer.toString(java));
		bf.newLine();
		bf.write("-------------------");
		bf.newLine();
		bf.write("총점 : "+Integer.toString(sum));
		bf.newLine();
		bf.write("평균 : "+avg);
		bf.newLine();
		bf.write("학점 : "+Prob2.checkGrade(avg));
		bf.newLine();
		bf.close();
		
		
		
		
	}

}
