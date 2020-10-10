package days14;

import java.io.*;

/*
	===> Keyboard로 입력받은 내용 test.txt로 보내는 Application 작성
*/

public class FileWriteTestFilter02
{
	//main method
	public static void main(String[] args) throws Exception{

		//필요객체 Stream / string 인스턴스 declaration
		BufferedReader br = null;
		BufferedWriter bw = null;

		// keyboard로 입력받기 위한 Sink Stream Reader 및
		// 1개의 line을 읽기편한 readLine() method를 제공하는 BufferedReader 생성
		// Reader r = new InputStreamReader(System.in);
		// br = new BufferedReader(r);
		br = new BufferedReader(new InputStreamReader(System.in));

		// File에 글을 쓰기 위한 FileWriter 및 BufferWriter 생성
		// FileWriter fw = new FileWriter("test.txt");
		// bw = new BufferedWriter(fw);
		//bw = new BufferedWriter(new FileWriter("test.txt")); // API check
		 bw = new BufferedWriter(new FileWriter("test.txt", true)); // API check
		
		System.out.println("파일에 저장하실 글을 입력하세요.");
		while(true){
			String str = br.readLine();
			if(str.equals("끝")){
				break;
			}
			bw.write(str, 1, str.length()-1); // API check
			bw.newLine(); //API check (line change)
		}
		bw.flush(); //flush 잊지 말 것
		
		//Stream close()
		br.close();
		bw.close();
	}
}