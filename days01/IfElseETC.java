class IfElseETC
{
	public static void main(String[] args) 
	{
		System.out.println("�Է��Ͻ� \"1��° �μ�\"�� : "+args[0]);
		System.out.println("�Է��Ͻ� \"2��° �μ�\"�� : "+args[2]);

		System.out.println("====================================");

		// �Է��� ���ڸ� int Data Type ���� �����ϴ� Integer.parseInt() ���
		
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		// i, j ������ ���� Ȯ������.
		System.out.println("i = "+i+"\t j="+j); // <== Ư������ \t ��� : ��°��Ȯ��
		System.out.println("���� ó��\n"); // <== Ư������ \n ��� : ��°�� Ȯ��
		System.out.println("================================");

		if( i > j ){
			System.out.println("i �� j ���� Ů�ϴ�");
		}else if(i==j){
			System.out.println("i �� j �� �����ϴ�.");
		}else if(i<j){
			System.out.println("i ���� j�� Ů�ϴ�.");
		}
	}
}