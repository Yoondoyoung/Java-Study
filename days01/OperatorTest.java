class OperatorTest
{
	public static void main(String[] args) 
	{
		int value = 1;

		//���� �������� ���
		value++;  // value++ �ǹ� : �ڱ��ڽ� 1 ����
		System.out.println("value++ : " +value);
		++value;  // ++value �ǹ� : �ڱ��ڽ� 1 ����
		System.out.println("++value : " +value);

		value--; // value-- �ǹ� : �ڱ��ڽ� 1 ����
		System.out.println("Value-- : " +value);
		--value; // --value �ǹ� : �ڱ��ڽ� 1 ����
		System.out.println("--value : " +value);

		//���������� ��� ==> �ּ��� Ǯ�鼭 ��°���� Ȯ��

		//int temp = value++; // �ǹ� : value ���� temp ���� �� �ڱ��ڽ� 1 ����
		//int temp = value--; // �ǹ� : value ���� temp ���� �� �ڱ��ڽ� 1 ����
		//int temp = ++value; // �ǹ� : value �ڱ��ڽ� 1 ���� �� �� temp�� ����
		 int temp = --value; // �ǹ� value �ڱ��ڽ� 1 ���� �� �� temp�� ����
		System.out.println("temp : "+ temp);
		System.out.println("value : "+value);

		// ������ ������ ����ϱ�

		int temp01 = 5%2;
		int temp02 = 5%3;
		System.out.println("������ ������ : 5%2 ==>"+temp01);
		System.out.println("������ ������ : 5%3 ==>" +temp02);

		// ���׿�����:: (����) ?������ ���̸� : ������ �����̸� :
		int temp03 = ( 1 <= 2) ? 3 : 4;
		System.out.println("���׿����� : ( 1 <= 2 ) ? 3 : 4 ==> "+temp03);

		// int temp04 = ( 1 =< 2 ) ? 3: 4 ;



	}
}