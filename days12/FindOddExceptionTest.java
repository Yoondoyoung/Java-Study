/*
	1. Exception.class ���, ���ο� Exception ���� ==> User Definition Exception
	2. User Definition Exception : JRE ���� ���ܸ� ���� �� �߻� �Ұ�.
	3. User Definition Exception : ���α׷����� �����ڰ� �ʿ�� ����, �߻����Ѿ� �Ѵ�.
		(throw �� ��� : User Definition Exception �߻���Ű��)
*/

class FindOddException extends Exception
{

	//fieldhi

	//Constructor
	public FindOddException(){
		System.out.println(" ==> FindOddException Default Constructor");
	}
	public FindOddException(String msg){
		super(msg);
		System.out.println("==> ���ڰ� �ִ� FindOddException Constructor");
	}
}

public class FindOddExceptionTest
{
	//Field

	//Constructor
	public FindOddExceptionTest(){
	}

	//method
	//Ȧ���� �ԷµǸ� FindOddExceptoin �߻���Ű�� method
	public void test(int number) throws FindOddException{

		System.out.println("::"+this.getClass().getName()+"start..");

		if(number%2 == 0){
			System.out.println("�Է��Ͻ� �� : "+number);
		}else{
			throw new FindOddException();
		}

		System.out.println("::"+this.getClass().getName()+"end..\n");
	}

	//main method

	public static void main(String[] args){
		FindOddExceptionTest met = new FindOddExceptionTest();
		try{
			met.test(10);
			met.test(11);
		}catch(FindOddException e){
			System.out.println("\n e : "+e);
		}
	}
}