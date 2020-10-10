
/*
	1. Reference type variable : Method 인자 ==> Call by Reference
	2. 실행 결과를 예측하고 코딩하여 예측결과 확인 : Call By Reference 이해
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

		//method의 인자 값으로 int(Reference Data Type)
		call.referenceChange(call);
		System.out.println("number : "+call.number);
	
	}

} 