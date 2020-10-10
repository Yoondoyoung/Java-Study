package days31;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileController {

	public void reverseLine(String oldString, String newString) throws Exception {
		// ����
		BufferedReader br = new BufferedReader(new FileReader(oldString));
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(newString))) {
			ArrayList<String> sa = new ArrayList<String>();

			while (true) {
				sa.add(br.readLine()); // ArrayList sa�� ������ ���� �� �о �־��ش�.
				if (sa.contains(null) == true) { // readLine()�� Eof�� null�� ������ ������ null���� �ִٴ°� ������ ���̶�� ��
					break;
				}
			}
			for (int i = sa.indexOf(null) - 1; i >= 0; i--) { // ArrayList�� �ε��� ���������� �����ϱ� ������ ������ ���� null�� �������� ���ִ�.
				/*
				 * if(sa.get(i) == null) { // �� ������ �� = �ε����� ������, sa.indexOf(null)�� -1�� ���൵ �ȴ�.
				 * continue; }
				 */
				bw.write(sa.get(i)); // sa �ϳ��� �ҷ�����
				bw.newLine();
			}
		}

		br.close(); // BufferedReader ��
	}

	public static void main(String[] args) {
		FileController c = new FileController();
		String oldfString = ".\\src\\days31\\oldf.txt";
		String newfString = ".\\src\\days31\\newf.txt";
		try {
			c.reverseLine(oldfString, newfString);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
