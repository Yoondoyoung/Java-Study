package days34;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prob2 {
	
	//static method
	public static char checkGrade(double avg) {
		//����
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
		
		System.out.println("�й��� �Է��ϼ��� : ");
		stdNum = keyboard.nextLine();
		System.out.println("���� ������ �Է��ϼ��� : ");
		kor = keyboard.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		math = keyboard.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		eng = keyboard.nextInt();
		System.out.println("�ڹ� ������ �Է��ϼ��� : ");
		java = keyboard.nextInt();
		
		//����
		sum = kor+math+eng+java;
		avg = (double)sum/4;
		BufferedWriter bf = new BufferedWriter(new FileWriter("grade.txt"));
		bf.write("-------------------");
		bf.newLine();
		bf.write("�й� : "+stdNum);
		bf.newLine();
		bf.write("-------------------");
		bf.newLine();
		bf.write("���� : "+Integer.toString(kor));
		bf.newLine();
		bf.write("���� : "+Integer.toString(math));
		bf.newLine();
		bf.write("���� : "+Integer.toString(eng));
		bf.newLine();
		bf.write("�ڹ� : "+Integer.toString(java));
		bf.newLine();
		bf.write("-------------------");
		bf.newLine();
		bf.write("���� : "+Integer.toString(sum));
		bf.newLine();
		bf.write("��� : "+avg);
		bf.newLine();
		bf.write("���� : "+Prob2.checkGrade(avg));
		bf.newLine();
		bf.close();
		
		
		
		
	}

}
