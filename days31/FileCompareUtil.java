package days31;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileCompareUtil {

	public ArrayList<String> compareFile(String fstFileName, String scdFileName) throws Exception {
		// 구현
		BufferedReader br = new BufferedReader(new FileReader(fstFileName));
		BufferedReader br2 = new BufferedReader(new FileReader(scdFileName));

		ArrayList<String> a3 = new ArrayList<String>();
		String s1 = ""; // first 줄 담는 String
		String s2 = ""; // second 줄 담은 String
		int lineNum = 1;
		int getLine = 0;

		while (true) {
			
			s1 = br.readLine(); // 비교를 위해 따로 담아준다
			s2 = br2.readLine();
			if (s1 == null) { // Eof 에 break
				break;
			}
			if(!s1.equals(s2)) { // String에서 equals는 값을 비교
				a3.add(s2); // 두 값이 다를경우  second 값을 a3에 넣어준다.
				System.out.println("Line"+lineNum+" : "+a3.get(getLine)); // 담은 값을 출력
				getLine++; // 라인 호출용
			}
			lineNum++; // 라인 넘버 호출용
		} // while문 종료
		br.close(); // 닫아준다
		br2.close();
		return a3;
	}

	public static void main(String[] args) throws Exception {

		FileCompareUtil util = new FileCompareUtil();
		System.out.println(util.compareFile(".\\src\\days31\\first.txt", ".\\src\\days31\\second.txt"));
		System.out.println("Successful!!");
	}
}
