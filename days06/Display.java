class BusCharge
{
	//Field
	String section;
	//constructor
	public BusCharge(){

}
	public BusCharge(String str){
		section = str;
	}
	//method
	public void information(){
		System.out.println("버스요금안내");
	}
	public void charge(){
		System.out.println("학생 : 300, 일반인 : 500, 어르신 : 무료");
	}
}

class Student extends BusCharge
{
	public Student(){
		super("학생");
	}
	public void charge(){
		System.out.println(":: 300원\n");
	}
	
}

class Adult extends BusCharge
{
	public Adult(){
		super("일반인");
	}
	public void charge(){
		System.out.println(":: 500원\n");
	}
}

class Old extends BusCharge{
	public Old(){
		super("어르신");
	}
	public void charge(){
		System.out.println(":: 무료\n");
	}
}

public class Display
	{
	//main method
	public static void main(String[]args){
		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();

		b1.information();
		System.out.println(b1.section);
		b1.charge(); // 어떤 클래스의 method가 호출되었는지 확인

		b2.information();
		System.out.println(b2.section);
		b2.charge();

		b3.information();
		System.out.println(b3.section);
		b3.charge();
	}
}