/*
	
	1.Bank.class Deposit.class PayOut.class �� �̿��Ͽ� HanmiBank�� ����
	2.Bank.class Deposit.class PayOut.class�� � ���࿡���� ���� �� �ִ�.
	3.Deposit.class PayOut.class �� ��������̸� ��𼭳� ����� �� �ִ� ����� ������
	  (SPEC �� ������ ::��������� �ݵ�� �Ա�, ��� ����� �����ؾ� �Ѵ�.) class
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
		System.out.println("����� : "+this.getName());
	}
	public void deposit(int money){
		System.out.println(money+"�� �Ա��մϴ�.");
	}
	public void payOut(int money){
		System.out.println(money+"�� �Ա��մϴ�.");
	}

	//main method
	public static void main(String[] args){
		HanmiBank hb = new HanmiBank("�ѹ�����");
		hb.display();
		hb.deposit(100);
		hb.payOut(200);

		//=> interface ���ο� ����� Field �ǹ̸� ��������.
		// interface �� Field �� Ȯ���ϰ�...
		System.out.println(Deposit.deposit);
		System.out.println(hb.payOut);

		//Field�� ���°��� �����غ���
		//Deposit.deposit = "�Ա�";
		//PayOut.payOut = "���";
		// => compile error �߻� interface �� ����Ǵ� ������ final static�� Ư¡�� ����
	}
}