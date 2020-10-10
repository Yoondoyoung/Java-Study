/*
	<<Anonymous Inner Class 의 이해>>
	1. class의 이름이 없는 독특한 class
*/

class A
{
	//Field
	//Constructor
	//Method
	public void abc(String message){
		System.out.println("::"+this.getClass().getName()+"start..");
		System.out.println("::abc()"+message);
		System.out.println("::"+this.getClass().getName()+"end..");
	}
}

public class AnonymousInnerClass
{

	//main method
	public static void main(String[] args){

		//1. 인스턴스 생성. 식별성으로 Method 접근
		System.out.println("=============================");
		A a = new A();
		a.abc("Hello");

		//2. 인스턴스 생성 후 바로 method 접근
		System.out.println("2.=======================");
		new A().abc("Hello");

		/*====================아래의 코드를 이해===================
		public class B extends A{
			public void def(String message){
				System.out.println("::Hi"+message);
			}
		}
		new B().abc("Hello");
		new B().def("Hi");
		================================*/

		//3. 위의 코드를 이해한다면 아래의 코드는...
		//==> Anonymous(익명, 불명 : 이름이 없는....)
		// 위의 소스에서 public class B extends 를 지우면...
		System.out.println("3. ====================");
		new A(){
			public void def(String message){
				System.out.println("::"+this.getClass().getName()+"start...");
				System.out.println("::def()"+message);
				System.out.println("::"+this.getClass().getName()+"end...");
			}
		}.abc("hello");

		System.out.println("4.=====================");
		new A(){
			public void def(String message){
				System.out.println("::"+this.getClass().getName()+"start...");
				System.out.println("::def()"+message);
				System.out.println("::"+this.getClass().getName()+"end...");
			}
		}.def("hello");
	}

}