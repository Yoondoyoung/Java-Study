package days31;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileController {

	public void reverseLine(String oldString, String newString) throws Exception {
		// 구현
		BufferedReader br = new BufferedReader(new FileReader(oldString));
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(newString))) {
			ArrayList<String> sa = new ArrayList<String>();

			while (true) {
				sa.add(br.readLine()); // ArrayList sa에 파일을 한줄 씩 읽어서 넣어준다.
				if (sa.contains(null) == true) { // readLine()은 Eof에 null이 나오기 때문에 null값이 있다는건 파일의 끝이라는 것
					break;
				}
			}
			for (int i = sa.indexOf(null) - 1; i >= 0; i--) { // ArrayList는 인덱스 끝에서부터 저장하기 때문에 파일의 끝인 null이 마지막에 들어가있다.
				/*
				 * if(sa.get(i) == null) { // 즉 파일의 끝 = 인덱스의 사이즈, sa.indexOf(null)에 -1을 해줘도 된다.
				 * continue; }
				 */
				bw.write(sa.get(i)); // sa 하나씩 불러오기
				bw.newLine();
			}
		}

		br.close(); // BufferedReader 끝
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
