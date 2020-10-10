package days14;

/*
	1. byte ó���� ���� Stream �� input / output Stream�� �̿��Ͽ�
	Keyboard �� �Է�, monitor�� ����ϴ� ��
	
	2.�ѱ�ó��(����ó��)�� ���Ͽ� Reader / Writer �迭�� �ٲپ� �Է�, ���
*/

import java.io.*;

public class WriterTest
{
	//Main method
	public static void main(String[] args){
		
		try{
			//InputStream :: ǥ���Է���ġ �߻�ȭ class
			//InputStream inputStream = System.in;
			//���� ó���� ���� Reader �� ����
			Reader reader = new InputStreamReader(System.in); // ������ ���� �ٽ� �����غ���

			//OutStream :: ǥ�������ġ �߻�ȭ class
			//OutputStream outputStream = System.out;
			//���� ó���� ���� Writer�� ����
			Writer writer = new OutputStreamWriter(System.out);

			System.out.println("�Է��� ��ٸ��ϴ�.");

			while(true){
				int i = reader.read();
				writer.write(i);
				writer.flush();

				if((char)i =='x'){
					break;
				}
			}
			//==> while �� ������ flush()�� ���� flush()�� �ǹ̴�?
			//writer.flush();

			//Stream close()
			reader.close();
			writer.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}