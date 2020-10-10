/*
	1. Primitive Type 형변환 (묵시적 / 명시적 ) : data의 크기
	2. Reference Type 형변환 ( 묵시적 / 명시적 ) : 개념의 크기 (추상화의 정도)
	 : 중요 , 중요 : 객체의 형변환 조건 : ~~ is a ~~ Relationship
*/

//상위 class Super 정의

class Super
{
	//method
	public void a(){
		System.out.println("Super : a()");
	}
}

//상위 class Super를 상속 받는 하위 class Sub 정의
class Sub extends Super
{
	//Method
	public void a(){
		System.out.println("OverRiding 된 Sub : a()");
	}
	public void b(){
		System.out.println("sub : b()");
	}
}

public class CastingComplete
{
	public static void main(String[] args){

		//하나 : 상위 class 인스턴스 생성 ( Data type == 인스턴스의 경우)
		System.out.println("\n 여기는 super s1 = new Super() 부분");
		Super s1 = new Super();
		s1.a();

		//둘 : 하위 class 인스턴스 생성 (Data type == 인스턴스의 경우)
		System.out.println("\n 여기는 Sub s2 = new Super() 부분");
		Sub s2 = new Sub();
		s2.a();
		s2.b();

		///셋 : 상위 data type 으로 하위 인스턴스 생성 ( Data type != 인스턴스)
		System.out.println("\n여기는 Super s3 = new Sub() 부분");
		Super s3 = new Sub();
		s3.a();
		// 아래 사항에서 error가 발생한다. s3는 b(0를 참조할 수 없다 ( 꼭 이해 )
		// s3.b();
		// s3.a() 를 사용하려면 ==> casting 연산자 사용 ( 즉 자신의 원상태 복귀(?))
		System.out.println("\n s3는 b()에 접근 불가하다.");
		System.out.println("casting 연산자를 이용 Sub sub = (Sub)s3 명시적 형변환");
		Sub sub = (Sub)s3;
		sub.b();

		//넷 : 하위 data type으로 상위 인스턴스 생성 ( Data type != 인스턴스)
		//error 부위 ( 하위 레퍼런스 변수는 상위 인스턴스를 레퍼런스할수없다.)
		//Sub s4 = new Super();
	}
}		
