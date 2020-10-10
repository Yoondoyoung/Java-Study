/*
	
	1.Bank.class Deposit.class PayOut.class 를 이용하여 HanmiBank를 구현
	2.Bank.class Deposit.class PayOut.class는 어떤 은행에서도 사용될 수 있다.
	3.Deposit.class PayOut.class 는 금융기관이면 어디서나 사용할 수 있는 기능을 정의함
	  (SPEC 을 정의한 ::금융기관은 반드시 입금, 출금 기능이 존재해야 한다.) class
*/

public class HanmiBank extends Bank implements Deposit.PayOut
{
	//Field

	//Constuctor
	public HanmiBank(){
	}
	public HanmiBank(String name){
		super(name);
	}

	//method
	public void display(){
		System.out.println("은행명 : "+this.getName());
	}
	public void deposit(int money){
		System.out.println(money+"를 입금합니다.");
	}
	public void payOut(int money){
		System.out.println(money+"를 입금합니다.");
	}

	//main method
	public static void main(String[] args){
		HanmiBank hb = new HanmiBank("한미은행");
		hb.display();
		hb.deposit(100);
		hb.payOut(200);

		//=> interface 내부에 선언된 Field 의미를 이해하자.
		// interface 의 Field 를 확인하고...
		System.out.println(Deposit.deposit);
		System.out.println(hb.payOut);

		//Field의 상태값을 변경해보자
		//Deposit.deposit = "입금";
		//PayOut.payOut = "출금";
		// => compile error 발생 interface 에 선언되는 변수는 final static의 특징을 갖음
	}
}