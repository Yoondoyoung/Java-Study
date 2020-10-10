package days33;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Vector;

public class Prob02 {

	public Vector getList() throws Exception {
		// 구현
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
			if (line.contains("java") || line.contains("JAVA")) { // upperCase나 lowCase로 전환해도 되지만 이게 더 짧은 것 같다.
				int score = Integer.parseInt(sa[2]); // casting
				if (score > 80) {
					line += "/수료";
				} else {
					line += "/미수료";
				}
			}
			if (line.contains("sql") || line.contains("SQL")) {
				int score = Integer.parseInt(sa[2]);
				if (score > 90) {
					line += "/수료";
				} else {
					line += "/미수료";
				}
			}
			//line에 "/" replace해서 ", " 로 바꿔도 될 것 같다.
			sa = line.split("/"); // 수료나 미수료 더해준거 다시 분할
			vv.add(sa[0]+","+sa[1]+","+sa[2]+","+sa[3]); // 따로 String 지정해도 가능하다.
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
