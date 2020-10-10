package days33;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Vector;

public class Prob02 {

	public Vector getList() throws Exception {
		// ����
		String[] sa = new String[5];
		String fileName = "C:\\Users\\YOON\\eclipse-workspace\\practice\\JavaClass\\src\\days33\\list.txt";
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		Vector vv = new Vector();
		while (true) {
			String line = br.readLine();
			if (line == null) {
				break;
			}
			sa = line.split("/");
			if (line.contains("java") || line.contains("JAVA")) { // upperCase�� lowCase�� ��ȯ�ص� ������ �̰� �� ª�� �� ����.
				int score = Integer.parseInt(sa[2]); // casting
				if (score > 80) {
					line += "/����";
				} else {
					line += "/�̼���";
				}
			}
			if (line.contains("sql") || line.contains("SQL")) {
				int score = Integer.parseInt(sa[2]);
				if (score > 90) {
					line += "/����";
				} else {
					line += "/�̼���";
				}
			}
			//line�� "/" replace�ؼ� ", " �� �ٲ㵵 �� �� ����.
			sa = line.split("/"); // ���ᳪ �̼��� �����ذ� �ٽ� ����
			vv.add(sa[0]+","+sa[1]+","+sa[2]+","+sa[3]); // ���� String �����ص� �����ϴ�.
		}
		return vv;
	}

	public static void main(String[] args) throws Exception {
		Prob02 e = new Prob02();
		Vector scores = e.getList();
		for (int i = 0; i < scores.size(); i++) {
			System.out.println(scores.get(i));
		}
	}
}
