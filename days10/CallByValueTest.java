/*
	1. Primitive type variable : Method ���� ==> Call By Value
	2. ���� ����� �����ϰ�, �ڵ��Ͽ� ������� Ȯ�� : Call By Value ����
*/

public class CallByValueTest
{
	//Field
	int number = 100;

	//Method
		public void valueChange(int value){
			System.out.println("====================");
			value = value + 100;
			System.out.println("Value : "+value);
			System.out.println("====================");
		}

	//Main method
	public static void main(String[] args)
	{
		CallByValueTest call = new CallByValueTest();

		//method�� ���� ������ int(primitive Data Type)
		call.valueChange(call.number);
		System.out.println("number : "+call.number);
	
	}
}