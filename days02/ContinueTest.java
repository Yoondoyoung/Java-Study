class ContinueTest
{
	public static void main(String[] args) 
	{
		// �Է¹��� data�� int ��ȯ
		int inputData = Integer.parseInt(args[0]);

		//���� ���� �����ϱ� ���� ����
		int sum = 0;

		for(int i = 0; i<inputData; i++){
			if(i%2==1){
				continue;
			}
			sum = sum+i;

			// �Ʒ� ������ for ��ȯ���� �����ϸ�
			// ������ ���� ��ȭ�� Ȯ���ϱ� ���� ��¹� (DEBUG)
			// System.out.println("i : "+i);
			// System.out.println("sum : "+sum);
		}

		System.out.println("0 ~"+inputData+"������ ¦���� ���� : "+sum);
	}
}
