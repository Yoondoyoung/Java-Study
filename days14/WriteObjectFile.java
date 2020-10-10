package days14;

import java.io.*;

/*
	ObjectOutputStream �� �̿� ȸ�������� ���� UserVO instance��
	(��ü�� ���¸� ���´� / ����������) persistence data(File)�� ����
*/

public class WriteObjectFile
{
	//main method
	public static void main(String[] args) throws Exception{

		//1. instance�� File�� ������ SinkStream :: FileOutputStream ����
		//2. instance�� �����ϴ� FileStream : ObjectOutputStream ����
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));

		oos.writeObject(new UserVO(1,"ȫ�浿")); // API Ȯ��
		oos.writeObject(new UserVO(2,"ȫ���")); // API Ȯ��
		oos.flush();

		//Stream close()
		oos.close();
	}
}