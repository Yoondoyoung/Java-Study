public class Developer1
{
	String name = "ȫ�浿";
	String job = "������";
	int avgIncome = 100;
	int projectCareer; // Field ���� �� ��� (������ ���� �� ���) �ʱ�ȭ ������??
 
	//Method ==> ���, ����(behavior)ǥ��
	/*
		project�� �����Ͽ� ������ ���� �� ����� ������ ��Ÿ���� method
		1. income �� 1 ����
		2. projectCareer�� 1 ����
		*/

	public void participateProject(){
		System.out.println("���α׷� ���߷� ��������, ��� ����");
		avgIncome++;
		projectCareer++;
	}
	/* ========== �߰��� method(OverLoading Method) =========
		project�� �����Ͽ� ������ ���� �� ����� ������ ��Ÿ���� method
		1. income �� 1 ����
		2. projectCareer�� 1 ����
		���� �� ���� project�� name�� ���÷��� �ϴ� ����

	*/

	public void participateProject(String project){
		System.out.println(project + "==> project ������ ��������, ��� ����");
		avgIncome++;
		projectCareer++;
	}
	/*
		���Ǹ� ���� ������ ����
		1. Income�� 1 ����
		����
	*/

	public void instruct(){
		System.out.println("���Ǹ� ���� ��������");
		avgIncome++;
	}

	// �߰��� method(OverLoading Method) ==========

	public void instruct(int lectureCount){
		System.out.println(lectureCount+"�� ���Ǹ� ���� ��������");
		avgIncome += lectureCount;
	}

}

