package days14;

import java.io.*;

/*
	ObjectInputStream을 이용 Persistence Data(File)에 저장된
	회원 정보를 갖는 UserVO instance를 (객체는 상태를 갖는다/ 상태정보를 ) 읽어온다
*/

public class ReadObjectFile
{
	//main method
	public static void main(String[] args) throws Exception{
		
		//1. File에서 Instance를 읽을 SinkStream :: FileInpuStream 생성
		//2. instance를 읽는 FilterStream : ObjectInputStream 생성
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserInfo.obj"));
		
		UserVO user01 = (UserVO)ois.readObject(); //API 확인 , 명시적 형변환 이유??
		UserVO user02 = (UserVO)ois.readObject(); //API 확인, 명시적 형변환 이유??

		System.out.println("1번째 회원 정보 : "+user01);
		System.out.println("2번째 회원 정보 : "+user02);

		//Stream close()
		ois.close();
	}
	
}