package days14;

/*
	1. java.io package : ���α׷� �ܺη� ������ �ްų�(?)/ ����(?) ��쿡 ���
	2. keyboard�� ���� data�� �о���̸�...

	===============================================================================
	InputStream �� �ѱ�ó���� ���� �ʴ´�.
	���ڸ� ó���ϴ� Reader �迭�� �ٲٸ�...
*/

import java.io.*;

public class ReaderTest
{
	//main method
	public static void main(String[] args){

		try{
			//InputStream :: ǥ���Է���ġ �߻�ȭ Class
			InputStream inputStream = System.in;
			//InputStream�� Reader�� ����(byte ó�� ==> ����ó�� ����)
			Reader reader = new InputStreamReader(inputStream);

			System.out.println("�Է��� ��ٸ��ϴ�.");

			//���� �о���̴� ����loop ����.
			while(true){
				// 1. java.io�� ����(block)�� �� �ִ�.
				int i = reader.read();
				char c = (char)i;

				// 2. java.io�� FIFO�� ����
				System.out.println("�Է��Ͻ� �� : "+c);

				//==> char 'x'�� �ԷµǸ� while ����
				if(c=='x'){
					inputStream.close();
					break;
				}
				//�ѱ� �Է½� ������. �ѱ� 1EA�� 2�� ����� ���� Ȯ������
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
