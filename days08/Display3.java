/*
	
	1.BusCharge.class �� charge() Method ���������..?
	2. ���� Ŭ���� (Student, Adult, Old)���� charge() Method �� OverRiding �ʴ´ٸ�?

	==> abstact Method / abstact class �� �ʿ伺 �� ����
	abstract Method
	=> ��ü���� �ʿ䰡 ���� Method
	-> ����Ŭ�������� ��ü������ ������(OverRiding)�ؾ��ϴ� �������� ���� Method

	abstract class
	=> ��ü������ ���� abstract Method�� ���ǵ� Ŭ����
	-> �Ϲ�ȭ�� ������ ������, �Ϲ��� ������ �Ӽ��� ������ �������� ���ǵ� Ŭ����
	==>abstract class �� instance ���� �� �� ���� :: �߿�

*/
abstract class BusCharge
{
	//Field
	String section;
	//constructor
	public BusCharge(){

}
	public BusCharge(String section){
		this.section = section;
	}
	//method
	public void information(){
		System.out.println("������ݾȳ�");
	}
	//==> ������ ������, ���� Ŭ������ OverRiding�� �����ϴ� �߻�޼��� ����
	//public void charge(){
	//	System.out.println("�л� : 300, �Ϲ��� : 500, ��� : ����");
	//}
	public abstract void charge();
}

class Student extends BusCharge
{
	public Student(){
		super("�л�");
	}
	public void charge(){
		System.out.println(":: 300��\n");
	}
	
}

class Adult extends BusCharge
{
	public Adult(){
		super("�Ϲ���");
	}
	public void charge(){
		System.out.println(":: 500��\n");
	}
}

class Old extends BusCharge{
	public Old(){
		super("���");
	}
	public void charge(){
		System.out.println(":: ����\n");
	}
}

public class Display3
	{
	//main method
	public static void main(String[]args){
		BusCharge b1 = new Student();
		BusCharge b2 = new Adult();
		BusCharge b3 = new Old();

		//Student b1 = new Student();
		//Adult b2 = new Adult();
		//Old b3 = new Old();

		//=> Polymorphism : �ϳ��� �������̽��� ���� �� �پ��� Ȱ��

		b1.information();
		System.out.println(b1.section);
		b1.charge(); // � Ŭ������ method�� ȣ��Ǿ����� Ȯ��

		b2.information();
		System.out.println(b2.section);
		b2.charge();

		b3.information();
		System.out.println(b3.section);
		b3.charge();

		//=> �Ʒ��� �ּ��� ���ʷ� Ǯ�� ������ ������ Ȯ������.
		// ==> 1. abstract class �� ��ü ���� �Ұ�
		// BusCharge bc01 = new BusCharge();

		//==> 2. ��ü ������ �Ұ��ϳ�, ������ ������ �����ϴ�.
		// BusCharge bc02;


		//==> ���� �ڵ��� �Ʒ��� �ڵ��� ���ϸ�
		// 1. �ݺ��� �κ��� ���°�
		// 2. ���� Data Type ����(�迭 : Array)�� �̿��Ͽ� �ϰ������� ������ �� �� ���°�
		BusCharge[] bc = new BusCharge[3];
		bc[0] = new Student();
		bc[1] = new Adult();
		bc[2] = new Old();

		for(int i = 0; i<bc.length; i++){
			bc[i].information();
			System.out.println(bc[i].section);
			bc[i].charge();
		}
	}
}
