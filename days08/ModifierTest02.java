/*
	1. TopSecret01.class ������
	 : secretNo�� �߿��� attribute�̴� �׷��� ������ ���� �� ������ ����
	 ==> Access Modifier �� ���� information hiding �� Method�� ���� ����
	*/






class TopSecret02
{
	//Field
	//=> access modifier�� Ȱ���� information hiding
	// private ������� ���, ���� ������ �� ������ �ϰ� getter method ���� ����

	private int secretNo = 7777;

	//Constructor
	public TopSecret02(){
	}

	//method
	//getter method
	public int getSecretNo(int pwd){
		if(pwd == 0){
			return secretNo;
		}else{
			return 0;
		}
	}
}

public class ModifierTest02
{
	//main
	public static void main(String[]args){

		TopSecret02 topSecret = new TopSecret02();

		//=> private Field�� information hiding �Ǿ� �־� ���� �� ������ �Ұ���
		// Method�� ���� ���ٸ� ���� / ����Ұ�
		// System.out.println(topSecret.secretNo);
		// topSecret.secretNo = 1234;

		System.out.println(topSecret.getSecretNo(0));
	}
}

// TopSecret�� ������
// secretNo�� �߿��� attribute�̴� �׷��� ������ ���� �� ����