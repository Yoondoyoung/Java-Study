/*
	1. TopSecret02 �� �߿��� class ��� modifier�� ���� ����� �� ������ ������,
	 : secretNo �� readOnly�� ��Ȯ�� ��
	 2. ���� �߿��� class��� ��ü ������ �Ұ����ϰ� �Ѵ�.
	 ==> �Ʒ��� coding�� ��������. �����ڸ� �ܺο��� �������� ���ϰ� private ����
	 �� : java.lang.System.class �� �ҽ��� API�� ���� Ȯ��)
	 3. static method�� ���� �ν��Ͻ��� ������ �� �ֵ��� �Ѵ�.
	*/




// final modifier ��ӺҰ�
final class TopSecret03
{
	//Field
	//=> access modifier�� Ȱ���� information hiding
	// final modifier �� Ȱ���� �����Ұ�

	private int secretNo = 7777;

	//Constructor
	//==> Access modifier�� ���� ��ü�����Ұ� (private Constructor�� ����� ���� ����)
	public TopSecret03(){
	}

	//method
	//getter method
	//method�� ���� ������ ������ ��츸 secretNo�� return
	public int getSecretNo(int pwd){
		if(pwd == 0){
			return secretNo;
		}else{
			return 0;
		}
	}


//static method�� �̿��� instance return �ϰ��ϸ� �ٸ� class���� ��밡���ϰ� ��
	public static TopSecret03 getInstance(){

	TopSecret03 topSecret = new TopSecret03();
	return topSecret;
	//return new TopSecret03
	}
}
public class ModifierTest03
{
	//main
public static void main(String[]args){

	//TopSecret03 topSecret = new TopSecret03();

	//=> private Field�� information hiding �Ǿ� �־� ���� �� ������ �Ұ���
	// Method�� ���� ���ٸ� ���� / ����Ұ�
	// System.out.println(topSecret.secretNo);
	// topSecret.secretNo = 1234;
	TopSecret03 topSecret = TopSecret03.getInstance();
	System.out.println(topSecret.getSecretNo(0));
	}
}


// TopSecret�� ������
// secretNo�� �߿��� attribute�̴� �׷��� ������ ���� �� ����