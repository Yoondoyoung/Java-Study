package days32;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class FileCalculator {
	
	public void addCalculateResult(String inputFileName) throws Exception{
		//구현
		String line = "";
		int sum = 0;
		int re = 1;
		
		BufferedReader bf = new BufferedReader(new FileReader(inputFileName));
		BufferedWriter bw = new BufferedWriter(new FileWriter(inputFileName, true));
		
		while(true) {
			line = bf.readLine();
			if(line == null) {
				break;
			}
			sum += Integer.parseInt(line);
			re *= Integer.parseInt(line);
		}
		line = Integer.toString(sum);
		bw.newLine();
		bw.write(line);
		line = Integer.toString(re);
		bw.newLine();
		bw.write(line);
		
		bf.close();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileCalculator fc = new FileCalculator();
		fc.addCalculateResult("C:\\Users\\YOON\\eclipse-workspace\\practice\\JavaClass\\src\\days32\\fc.txt"); // 파일 절대경로
	}

}
