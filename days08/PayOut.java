/*
	1. 금융업무를 하는 곳이라면 출금업무(기능)은 필수기능
	2. 은행, 금고, 증권 등 어느곳이나 공통된 업무인 출금업무(기능)을 interface 정의
*/

public interface PayOut
{
	//interface Field(member variable) => public static final 특성을 갖는다.
	public final static String payOut = "출금";

	//interface method => public abstract 특성을 갖는다.
	public abstract void payOut(int money);

}