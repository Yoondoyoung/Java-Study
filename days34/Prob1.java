package days34;

import java.util.Vector;

public class Prob1 {

	public static void main(String[] args) throws Exception {
		// �� ������ ���� FileName ����
		String pathName = "./src/data.txt";
		
		//data.txt ���� ���
		FileUtil.fileToPrint(pathName);
		
		System.out.println("==========");
		//data.txt ������ ���� ������ �˻�, ����� ���� Vector �ν��Ͻ� �ޱ�
		System.out.println("���� ������ ���� ���� �˻�");
		Vector<User> vector = FileUtil.fileFindAddres(pathName,"����");
		for(int i =0; i<vector.size(); i++) {
			//����
			System.out.println(vector.get(i));
		}
		
		System.out.println("==========");
		//data.txt ������ ���� ������ �˻�, ����� ���� Vector �ν��Ͻ� �ޱ�
		System.out.println("���� ������ ���� ���� �˻�");
		vector = FileUtil.fileFindAddres(pathName,"����");
		for(int i =0; i<vector.size(); i++) {
			//����
			System.out.println(vector.get(i));
		}
		
		System.out.println("==========");
		//data.txt ������ ���� ������ �˻�, ����� ���� Vector �ν��Ͻ� �ޱ�
		System.out.println("���� ������ ��⵵ ���� �˻�");
		vector = FileUtil.fileFindAddres(pathName,"��⵵");
		for(int i =0; i<vector.size(); i++) {
			//����
			System.out.println(vector.get(i));
		}
		
	}

}
