/*
	
	1.ModifierTest01.ModifierTest02,Modifier03,ModifierTest04�� ����
	Class ������ Modifier / Access Modifier ��� Ȱ��, ����Ǵ��� ���캸��..
	
	TopSecret01.class�� Access Modifier, Modifier �� ��� �����Ű���� ����
*/

class TopSecret01
{
	//Field
	int secretNo = 7777;

	//Constructor
	public TopSecret01(){
	}

	//method
	//getter method
	public int getSecretNo(){
		return secretNo;
	}
}

public class ModifierTest01
{
	//main
	public static void main(String[]args){

		TopSecret01 topSecret = new TopSecret01();
		System.out.println(topSecret.getSecretNo());
	}
}

// TopSecret�� ������
// secretNo�� �߿��� attribute�̴� �׷��� ������ ���� �� ������ ����