class BreakTest
{
	public static void main(String[] args) 
	{
		int inputData = Integer.parseInt(args[0]);

		// while ���� �ʱ�ȭ ���� ����
		int i = 0;

		// ���Ѱ��� �����ϱ� ���� ���� ����
		int sum = 0;

		while(true){
			i++;
			sum = sum+i;

			if (i==inputData){
				break;
			}
		}// end of while
		System.out.println("0 ~ "+inputData+"������ ���� : "+sum+"�Դϴ�.");
	}

}