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
		builder.append("Nothing [이름 = ");
		builder.append(name);
		builder.append(", 주소 = ");
		builder.append(add);
		builder.append(", 나이 = ");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	public static void main(String[] args) throws Exception {
		try {
		MyException me = new MyException("잘못된 입력 정보");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("주소 입력 : ");
		String add = sc.next();
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		Nothing noth = new Nothing(name, add, age);
		BufferedWriter bf = new BufferedWriter(new FileWriter(noth.name+".txt"));
		bf.write("이름 : "+noth.name);
		bf.newLine();
		bf.write("주소 : "+noth.add);
		bf.newLine();
		bf.write("나이 : "+noth.age); // String + int == String
		bf.close();
		System.out.println(noth);
		}catch(MyException me) {
			me.getMessage();
			me.printStackTrace();
		}
	}

}
