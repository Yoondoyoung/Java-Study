package days14;

import java.io.*;

/*
	1. read() method보다 효율적인 method 를 제공하는 class 사용
	2. Sink stream : Data 를 직접 주고 받는 단순입출력 Stream
		Filter Stream : Sink Stream 을 통해 들어온 Data 조작하는 Stream
		차이 이해
*/

public class BufferedReaderTest
{
	//main method
	public static void main(String[] args) throws Exception{

		//read 수 count 위한 변수
		int readCount = 0;

		//SinkStream ==> 말단에서 단순 입출력만 담당
		//FileReader fr = new FileReader(args[0]);
		//Filter Stream => 추가적인 기능을 제공
		//BufferedReader br = new BufferedReader(fr);

		//==> 위희 두 Line과 아래를 비교하자
		BufferedReader br = new BufferedReader(new FileReader(args[0]));

		String oneLine = null;

		while(true){
			
			readCount++;

			oneLine = br.readLine(); // API 확인
			if(oneLine == null){ // API check
			break;
			}
			System.out.println("한줄 출력 : "+readCount+" "+oneLine);

		}
		//Stream.close
		br.close();
	//	fr.close();
	}


}