public class CalculationTest
{
	public static void main(String[] args) 
	{
		int a;
		a = 0;
		int b = 1;
		int c = 2;

		System.out.println("a="+a+"b="+b+"c="+c);
		
		//숫자 + 연산자 사용
		int sum = a+b+c;
		System.out.println("sum = " +sum);
		System.out.println("a+b+c="+(a+b+c));
		System.out.println("a+b+c="+a+b+c);

		c = c + 10;
		System.out.println("c = (c + 10) :" +c);
		// 연산 후 대입연산자(+=) 사용 ( c = c +10) 동일한 의미
		c -= 10;
		System.out.println("c += 10 = " +c);

		boolean boo1 = true;
		boolean boo2 = !boo1;

		System.out.println("boo1 : "+boo1);
		System.out.println("boo2 : "+boo2);
		
	}
}

