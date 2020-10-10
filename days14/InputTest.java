package days14;

import java.io.*;

/*
	1. java.io package : ���α׷� �ܺη� ������ �ްų�(?)/ ����(?) ��쿡 ���
	2. keyboard�� ���� data�� �о���̸�...
*/

public class InputTest
{
	//Main method
	public static void main(String[] args){
		
		System.out.println(args[0]);

		//InputStream :: ǥ���Է���ġ �߻�ȭ�� class
		InputStream inputStream = System.in;

		System.out.println("�Է��� ��ٸ��ϴ�...");

		try{
			//���� �о���̴� ����loop ����.
			while(true){
				// 1. java.io�� ����(block)�� �� �ִ�.
				int i = inputStream.read();
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