
/*
	1. Reference type variable : Method ���� ==> Call by Reference
	2. ���� ����� �����ϰ� �ڵ��Ͽ� ������� Ȯ�� : Call By Reference ����
*/

public class CallByReferenceTest
{
	
	//Field
	int number = 100;

	//Method
		public void referenceChange(CallByReferenceTest value){
			System.out.println("====================");
			value.number = 100 + value.number;
			System.out.println("Value : "+value.number);
			System.out.println("====================");
		}

	//Main metho
	public static void main(String[] args)
	{

		CallByReferenceTest call = new CallByReferenceTest();

		//method�� ���� ������ int(Reference Data Type)
		call.referenceChange(call);
		System.out.println("number : "+call.number);
	
	}

} 