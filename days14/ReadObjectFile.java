package days14;

import java.io.*;

/*
	ObjectInputStream�� �̿� Persistence Data(File)�� �����
	ȸ�� ������ ���� UserVO instance�� (��ü�� ���¸� ���´�/ ���������� ) �о�´�
*/

public class ReadObjectFile
{
	//main method
	public static void main(String[] args) throws Exception{
		
		//1. File���� Instance�� ���� SinkStream :: FileInpuStream ����
		//2. instance�� �д� FilterStream : ObjectInputStream ����
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserInfo.obj"));
		
		UserVO user01 = (UserVO)ois.readObject(); //API Ȯ�� , ����� ����ȯ ����??
		UserVO user02 = (UserVO)ois.readObject(); //API Ȯ��, ����� ����ȯ ����??

		System.out.println("1��° ȸ�� ���� : "+user01);
		System.out.println("2��° ȸ�� ���� : "+user02);

		//Stream close()
		ois.close();
	}
	
}