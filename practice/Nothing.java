package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Nothing {
	// Field
	private String name = "";
	private String add = "";
	private int age = 0;

	public Nothing() {
		// TODO Auto-generated constructor stub
	}
	// method

	public Nothing(String name, String add, int age) {
		this.name = name;
		this.add = add;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nothing [�̸� = ");
		builder.append(name);
		builder.append(", �ּ� = ");
		builder.append(add);
		builder.append(", ���� = ");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	public static void main(String[] args) throws Exception {
		try {
		MyException me = new MyException("�߸��� �Է� ����");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸� �Է� : ");
		String name = sc.next();
		System.out.println("�ּ� �Է� : ");
		String add = sc.next();
		System.out.println("���� �Է� : ");
		int age = sc.nextInt();
		Nothing noth = new Nothing(name, add, age);
		BufferedWriter bf = new BufferedWriter(new FileWriter(noth.name+".txt"));
		bf.write("�̸� : "+noth.name);
		bf.newLine();
		bf.write("�ּ� : "+noth.add);
		bf.newLine();
		bf.write("���� : "+noth.age); // String + int == String
		bf.close();
		System.out.println(noth);
		}catch(MyException me) {
			me.getMessage();
			me.printStackTrace();
		}
	}

}
