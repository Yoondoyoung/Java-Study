package days14;

import java.io.*;

/*
	==> FileCopy�ϴ� Applicaion �ۼ�
	1. keyboard �� FileName�� �Է�
	2. File�� ������ read() ==> FileReader
	3. File�� ������ write() ==> FileWriter
*/

public class FileWriteTestFilter01 {
	// main method

	public static void main(String[] args) throws IOException {

		// �ʿ� ��ü Stream/String �ν��Ͻ� declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		String fileName = "";
		String copyFileName = "";

		int readCount = 0; // read�� count

		System.out.print("copy�� file �̸��� �Է��ϼ��� : ");
		// copy�� FileName�� �Է¹ޱ�
		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();

		// �������� Data�� read�� �� �ִ� BufferedReader ����
		br = new BufferedReader(new FileReader(fileName));

		// �纻���� �̸� �����
		copyFileName = fileName + "_copy";
		// => Data�� write �� �� �ִ� BufferedWriter ����
		bw = new BufferedWriter(new FileWriter(copyFileName));

		// read / write �ϴ� while ��
		String source = null;
		while ((source = br.readLine()) != null) {
			bw.write(source);
			bw.newLine();
			readCount++;
		}
		bw.flush(); // ==> ������ ��

		// Stream.close()
		bw.close();
		br.close();

		System.out.println("=======================================");
		System.out.println("======> read Ƚ�� : readCount : " + readCount);
		System.out.println("=======================================");
	}
}
