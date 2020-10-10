public class PrimitiveTest
{
	public static void main(String[] args) 
	{
		//논리형
		boolean boo = true;
		//문자형
		char c = '홍';
		//정수형
		byte b = 127;
		
		short s = 1000;
		int i = 1000;
		long l = 1000L;
		//실수형
		float f= 1000.5F;
		double d= 1000.5;
		
		System.out.print("자바의 Primitive Data type을++");
		System.out.println("사용하여 표준출력 장치로..."+"::출력");

		// 연산자의 의미(문자와 +연산자가 사용되면 append)
		System.out.println("논리형 : " + boo);
		System.out.println("문자형 : "+c);
		System.out.println("정수형 byte : "+b);
		System.out.println("정수형 int : "+i);
		System.out.println("정수형 long : "+l);
		System.out.println("실수형 float : "+f);
		System.out.println("실수형 double : "+d);
		
	}
}

