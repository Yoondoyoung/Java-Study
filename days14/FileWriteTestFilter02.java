package days14;

import java.io.*;

/*
	===> Keyboard�� �Է¹��� ���� test.txt�� ������ Application �ۼ�
*/

public class FileWriteTestFilter02
{
	//main method
	public static void main(String[] args) throws Exception{

		//�ʿ䰴ü Stream / string �ν��Ͻ� declaration
		BufferedReader br = null;
		BufferedWriter bw = null;

		// keyboard�� �Է¹ޱ� ���� Sink Stream Reader ��
		// 1���� line�� �б����� readLine() method�� �����ϴ� BufferedReader ����
		// Reader r = new InputStreamReader(System.in);
		// br = new BufferedReader(r);
		br = new BufferedReader(new InputStreamReader(System.in));

		// File�� ���� ���� ���� FileWriter �� BufferWriter ����
		// FileWriter fw = new FileWriter("test.txt");
		// bw = new BufferedWriter(fw);
		//bw = new BufferedWriter(new FileWriter("test.txt")); // API check
		 bw = new BufferedWriter(new FileWriter("test.txt", true)); // API check
		
		System.out.println("���Ͽ� �����Ͻ� ���� �Է��ϼ���.");
		while(true){
			String str = br.readLine();
			if(str.equals("��")){
				break;
			}
			bw.write(str, 1, str.length()-1); // API check
			bw.newLine(); //API check (line change)
		}
		bw.flush(); //flush ���� �� ��
		
		//Stream close()
		br.close();
		bw.close();
	}
}