public class Developer
{

// => Field == Ư��,�Ӽ�(Attribute) ǥ��
		String name = "ȫ�浿"; // 
		String job = "������";
		int avgIncome = 100;
		int projectCareer;  // Field ���� �� ��� (������ ���� �� ���) �ʱ�ȭ ������ ?


		// Method ==> ���, ����(behavior) ǥ��
		/*
		project�� �����Ͽ� ������ ���� �� ����� ������ ��Ÿ���� method
		1. income�� ����
		2. projectCareer�� ����
		*/
	public void participateProject(){
		System.out.println("���α׷� ���߷� ��������, ��½���");
		avgIncome++;
		projectCareer++;
	}

	public void instruct(){
		System.out.println("���Ǹ� ���� ��������");
		avgIncome++;
	}
	
}
