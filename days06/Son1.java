

/*
	1. Encapsulation(information hiding0�� �����ϴ� Access Modifier ����
	2. public / protected /      / private �� ��� �� ����

	Son�� Father�� ���� package�� �����ϸ� ��Ӱ����̴�.
	�ּ��� Ǯ�� 
	=> Compile �� error�� Ȯ���ϰ�, error�� �ǹ� ����
	=> �� Access Modifier�� ���� ������ Ȯ��
*/

public class Son1 extends Father
{

	//Field

	//Constructor
	public Son1(){
		System.out.println(this.name); // => public String name = "ȫ�浿"
		System.out.println(bank); // => protected String bank = "�Ѿ�����";
		System.out.println(branch); // => String branch = "���ﵿ����";
		//System.out.println(password); //=> private int password = 1234;

		//Field(��������)�� method(����)�� �̿� ����
		System.out.println("���� ��й�ȣ : "+this.getPassword(0));
	}
}

/*
	1. private�� ����� �ٸ� class�� ���� �������� ����
	2. method�� ���� �������� ���θ� ����
*/