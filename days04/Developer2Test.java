public class Developer2Test
{
	public static void main(String[]args){
		
		Developer2 developer = new Developer2();

		//System.out.println("�̸��� : "+developer.name);
		//System.out.println("������ : "+developer.job);
		System.out.println("��ռ�����: "+developer.avgIncome);
		System.out.println("PJT�����: "+developer.projectCareer);

		System.out.println("=======================");

		String name = developer.getName(1234);
		String job = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		System.out.println("�̸��� : "+name);
		System.out.println("������ : "+job);
		System.out.println("��ռ����� : "+avgIncome);
		
		System.out.println("��ռ����� : "+developer.getProjectCareer());
	}
}