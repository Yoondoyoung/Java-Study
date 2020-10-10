package days31;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileCompareUtil {

	public ArrayList<String> compareFile(String fstFileName, String scdFileName) throws Exception {
		// ����
		BufferedReader br = new BufferedReader(new FileReader(fstFileName));
		BufferedReader br2 = new BufferedReader(new FileReader(scdFileName));

		ArrayList<String> a3 = new ArrayList<String>();
		String s1 = ""; // first �� ��� String
		String s2 = ""; // second �� ���� String
		int lineNum = 1;
		int getLine = 0;

		while (true) {
			
			s1 = br.readLine(); // �񱳸� ���� ���� ����ش�
			s2 = br2.readLine();
			if (s1 == null) { // Eof �� break
				break;
			}
			if(!s1.equals(s2)) { // String���� equals�� ���� ��
				a3.add(s2); // �� ���� �ٸ����  second ���� a3�� �־��ش�.
				System.out.println("Line"+lineNum+" : "+a3.get(getLine)); // ���� ���� ���
				getLine++; // ���� ȣ���
			}
			lineNum++; // ���� �ѹ� ȣ���
		} // while�� ����
		br.close(); // �ݾ��ش�
		br2.close();
		return a3;
	}

	public static void main(String[] args) throws Exception {

		FileCompareUtil util = new FileCompareUtil();
		System.out.println(util.compareFile(".\\src\\days31\\first.txt", ".\\src\\days31\\second.txt"));
		System.out.println("Successful!!");
	}
}
