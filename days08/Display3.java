/*
	
	1.BusCharge.class 의 charge() Method 사용유무는..?
	2. 하위 클래스 (Student, Adult, Old)에서 charge() Method 가 OverRiding 않는다면?

	==> abstact Method / abstact class 의 필요성 및 이해
	abstract Method
	=> 구체적일 필요가 없는 Method
	-> 하위클래스에서 구체적으로 재정의(OverRiding)해야하는 강제성을 갖는 Method

	abstract class
	=> 구체적이지 않은 abstract Method가 정의된 클래스
	-> 일반화의 관계중 공통적, 일반적 행위와 속성을 공유를 목적으로 정의된 클래스
	==>abstract class 는 instance 생성 할 수 없다 :: 중요

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
		System.out.println("버스요금안내");
	}
	//==> 사용되지 않으며, 하위 클래스에 OverRiding을 강제하는 추상메서드 정의
	//public void charge(){
	//	System.out.println("학생 : 300, 일반인 : 500, 어르신 : 무료");
	//}
	public abstract void charge();
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

		//=> Polymorphism : 하나의 인터페이스로 접근 및 다양한 활용

		b1.information();
		System.out.println(b1.section);
		b1.charge(); // 어떤 클래스의 method가 호출되었는지 확인

		b2.information();
		System.out.println(b2.section);
		b2.charge();

		b3.information();
		System.out.println(b3.section);
		b3.charge();

		//=> 아래의 주석을 차례로 풀어 컴파일 에러를 확인하자.
		// ==> 1. abstract class 는 객체 생성 불가
		// BusCharge bc01 = new BusCharge();

		//==> 2. 객체 생성은 불가하나, 변수의 선언은 가능하다.
		// BusCharge bc02;


		//==> 위의 코딩과 아래의 코딩을 비교하면
		// 1. 반복된 부분은 없는가
		// 2. 같은 Data Type 묶음(배열 : Array)을 이용하여 일괄적으로 관리할 수 는 없는가
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
