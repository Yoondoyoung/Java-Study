package days14;

import java.io.*;

/*
	1. read() method���� ȿ������ method �� �����ϴ� class ���
	2. Sink stream : Data �� ���� �ְ� �޴� �ܼ������ Stream
		Filter Stream : Sink Stream �� ���� ���� Data �����ϴ� Stream
		���� ����
*/

public class BufferedReaderTest
{
	//main method
	public static void main(String[] args) throws Exception{

		//read �� count ���� ����
		int readCount = 0;

		//SinkStream ==> ���ܿ��� �ܼ� ����¸� ���
		//FileReader fr = new FileReader(args[0]);
		//Filter Stream => �߰����� ����� ����
		//BufferedReader br = new BufferedReader(fr);

		//==> ���� �� Line�� �Ʒ��� ������
		BufferedReader br = new BufferedReader(new FileReader(args[0]));

		String oneLine = null;

		while(true){
			
			readCount++;

			oneLine = br.readLine(); // API Ȯ��
			if(oneLine == null){ // API check
			break;
			}
			System.out.println("���� ��� : "+readCount+" "+oneLine);

		}
		//Stream.close
		br.close();
	//	fr.close();
	}


}